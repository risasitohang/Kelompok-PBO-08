/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import pbo08.gui.widget.DashboardController;


/**
 * FXML Controller class
 *
 * @author MZ17
 */
public class HasilTestController implements Initializable {

    /**
     * Initializes the controller class.
     */
     @FXML
    private Label hasil;
     
    @FXML
    private Ellipse lingkaran;

    @FXML
    private Button kembali;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        kembali();
    }    
    
    public void getHasil(String a){
        hasil.setText(a);
        
        if(a=="Resiko Tinggi"){
            hasil.setTextFill(Color.web("#eb2b2b"));
            lingkaran.setFill(Color.web("#eb2b2b"));
        }else if(a == "Resiko Sedang"){
            hasil.setTextFill(Color.web("#fbe91e"));
            lingkaran.setFill(Color.web("#fbe91e"));
        }
        else if(a == "Resiko rendah"){
            hasil.setTextFill(Color.web("#25dd4d"));
            lingkaran.setFill(Color.web("#25dd4d"));
            
        }
        
  }
    
    public void kembali(){
        kembali.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent Login;
                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("/view/dashboard.fxml"));
                    loader.load();
                    Login = loader.getRoot();
                    Scene sceneLogin = new Scene(Login);
                    Stage stageLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stageLogin.setScene(sceneLogin);
                    stageLogin.show();
                } catch (IOException ex) {
                    
                }
            }
        });
    }
    
}
