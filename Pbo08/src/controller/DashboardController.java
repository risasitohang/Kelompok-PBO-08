package pbo08.dashboard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Risa Jessica Sitohan
 */
public class DashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
      @FXML
    private Button btnInfo;

    @FXML
    private Button btnCegah;

    @FXML
    private Button btnCara;

    @FXML
    private Pane about;

    @FXML
    private Button btnAbout;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
     @FXML
    void BtnAbout(ActionEvent event) throws IOException {
             Parent root;
         Parent Login = FXMLLoader.load(getClass().getResource("/view/About.fxml"));
        Scene sceneLogin = new Scene(Login);
        Stage stageLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageLogin.setScene(sceneLogin);
        stageLogin.show();
    }

    @FXML
    void BtnInfo(ActionEvent event) throws IOException {
         Parent root;
         Parent Login = FXMLLoader.load(getClass().getResource("/pbo08/gui/widget/widget.fxml"));
        Scene sceneLogin = new Scene(Login);
        Stage stageLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageLogin.setScene(sceneLogin);
        stageLogin.show();
    }

    @FXML
    void BtnMencegah(ActionEvent event) throws IOException {
        Parent root;
         Parent Login = FXMLLoader.load(getClass().getResource("/view/Pencegahan.fxml"));
        Scene sceneLogin = new Scene(Login);
        Stage stageLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageLogin.setScene(sceneLogin);
        stageLogin.show();
    }

    @FXML
    void btnCek(ActionEvent event) throws IOException {
         Parent root;
         Parent Login = FXMLLoader.load(getClass().getResource("/view/CekResiko.fxml"));
        Scene sceneLogin = new Scene(Login);
        Stage stageLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageLogin.setScene(sceneLogin);
        stageLogin.show();
    }
    
    @FXML
    void BtnLogOut(ActionEvent event) throws IOException {
        Parent root;
         Parent Login = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene sceneLogin = new Scene(Login);
        Stage stageLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageLogin.setScene(sceneLogin);
        stageLogin.show();
    }

}
