package pbo08.gui.widget;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Window;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import pbo08.config.ConfigModel;
import pbo08.config.ConfigurationService;
import pbo08.datafetch.DataProviderService;
import pbo08.datafetch.model.CountryData;
import pbo08.datafetch.model.CovidDataModel;
import pbo08.datafetch.model.GlobalData;

public class WidgetController implements Initializable {

    private ScheduledExecutorService executorService;
    private ConfigModel configModel;
  @FXML
    private PieChart pie;
     @FXML
    private Button btnback;
  @FXML
    private PieChart pieIndo;
    @FXML
    public AnchorPane rootPane;
    @FXML
    public Text textGlobalReport, textCountryCode, textCountryReport;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            configModel = new ConfigurationService().getConfiguration();
        } catch (Exception e) {
            e.printStackTrace();
        }
        initializeScheduler();
        initializeContextMenu();
        textCountryCode.setText(configModel.getCountryCode());
        
        setPiee();
    }
    
      private void pie(CovidDataModel covidDataModel) {
           ObservableList<PieChart.Data> rlist = FXCollections.observableArrayList();
            ObservableList<PieChart.Data> rlistin = FXCollections.observableArrayList();
         int sembuh = 0;
         int sakit = 0;
        GlobalData globalData = covidDataModel.getGlobalData();
        textGlobalReport.setText(getFormattedData(globalData.getCases(), globalData.getRecovered(), globalData.getDeaths()));
        rlist.add(new PieChart.Data("Sembuh ", globalData.getCases()));
         rlist.add(new PieChart.Data("Meninggal ", globalData.getRecovered()));

        CountryData countryData = covidDataModel.getCountryData();
        textCountryReport.setText(getFormattedData(countryData.getCases(), countryData.getRecovered(), countryData.getDeaths()));
          rlistin.add(new PieChart.Data("Sembuh", globalData.getCases()));
         rlistin.add(new PieChart.Data("Meniggal", globalData.getRecovered()));
        readjustStage(textCountryCode.getScene().getWindow());
         pie.setData(rlist);
         pieIndo.setData(rlistin);
                 
    }
  
    private void initializeScheduler() {
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(this::loadData, 0, configModel.getRefreshIntervalInSeconds(), TimeUnit.SECONDS);
    }

    private void loadData() {
        System.out.println("Refreshing data...");

        DataProviderService dataProviderService = new DataProviderService();
        CovidDataModel covidDataModel = dataProviderService.getData(configModel.getCountryName());

        Platform.runLater(() -> {
            inflateData(covidDataModel);
            pie(covidDataModel);
        });
    }
     private void setPiee() {
        System.out.println("Refreshing data...");

        DataProviderService dataProviderService = new DataProviderService();
        CovidDataModel covidDataModel = dataProviderService.getData(configModel.getCountryName());

        Platform.runLater(() -> {
            pie(covidDataModel);
        });
    }

    private void inflateData(CovidDataModel covidDataModel) {
        GlobalData globalData = covidDataModel.getGlobalData();
        textGlobalReport.setText(getFormattedData(globalData.getCases(), globalData.getRecovered(), globalData.getDeaths()));

        CountryData countryData = covidDataModel.getCountryData();
        textCountryReport.setText(getFormattedData(countryData.getCases(), countryData.getRecovered(), countryData.getDeaths()));

        readjustStage(textCountryCode.getScene().getWindow());
    }

    private String getFormattedData(long totalCases, long recoveredCases, long totalDeaths) {
        return String.format("Positif: %-8d | Sembuh: %-6d | Meninggal: %-6d", totalCases, recoveredCases, totalDeaths);
    }

    private void readjustStage(Window stage) {
        stage.sizeToScene();

        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        stage.setX(visualBounds.getMaxX() - 25 - textCountryCode.getScene().getWidth());
        stage.setY(visualBounds.getMinY() + 25);
    }

    private void initializeContextMenu() {
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(event -> {
            System.exit(0);
        });

        MenuItem refreshItem = new MenuItem("Refresh now");
        refreshItem.setOnAction(event -> {
            executorService.schedule(this::loadData, 0, TimeUnit.SECONDS);
        });

        final ContextMenu contextMenu = new ContextMenu(exitItem, refreshItem);
        rootPane.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            if (event.isSecondaryButtonDown()) {
                contextMenu.show(rootPane, event.getScreenX(), event.getScreenY());
            } else {
                if (contextMenu.isShowing()) {
                    contextMenu.hide();
                }
            }
        });
    }
    @FXML
    void btnBack(ActionEvent event) throws IOException {
         Parent root;
         Parent Login = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
        Scene sceneLogin = new Scene(Login);
        Stage stageLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageLogin.setScene(sceneLogin);
        stageLogin.show();
    }
}
