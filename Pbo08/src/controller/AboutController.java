/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo08.about;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Risa Jessica Sitohan
 */
public class AboutController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    void Btnback(ActionEvent event) throws IOException {
         Parent root;
         Parent Login = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
        Scene sceneLogin = new Scene(Login);
        Stage stageLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageLogin.setScene(sceneLogin);
        stageLogin.show();
    }

    
}
