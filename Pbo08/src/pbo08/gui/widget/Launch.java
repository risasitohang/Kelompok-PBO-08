package pbo08.gui.widget;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Launch extends Application {

    private double xOffset;
    private double yOffset;

    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage.initStyle(StageStyle.UTILITY);
//        primaryStage.setOpacity(0);
//        primaryStage.show();
//
//        Stage secondaryStage = new Stage();
//        secondaryStage.initStyle(StageStyle.UNDECORATED);
//        secondaryStage.initOwner(primaryStage);
//
        Parent root = FXMLLoader.load(getClass().getResource("/view/SplashScreen.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//
//        //Make it right-top aligned
//        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
//        secondaryStage.setX(visualBounds.getMaxX() - 25 - scene.getWidth());
//        secondaryStage.setY(visualBounds.getMinY() + 25);
//
//        //Add support for drag and move
//        //Drag = mouse click + drag
//        scene.setOnMousePressed(event -> {
//            xOffset = secondaryStage.getX() - event.getScreenX();
//            yOffset = secondaryStage.getY() - event.getScreenY();
//        });
//        scene.setOnMouseDragged(event -> {
//            secondaryStage.setX(event.getScreenX() + xOffset);
//            secondaryStage.setY(event.getScreenY() + yOffset);
//        });
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
