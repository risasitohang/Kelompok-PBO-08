/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MZ17
 */
public class SplashScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
     @FXML 
    Button scene;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Timer myTimer = new Timer();
          myTimer.schedule(new TimerTask(){

            @Override
            public void run() {
              Platform.runLater(()->{
                        try{
                            Parent root;
                           
                            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
                            root = loader.load();
                            Stage stage = (Stage) scene.getScene().getWindow();
                             stage.close();
                            stage.setScene(new Scene(root));
                            stage.setTitle("Beranda");
                            stage.show();
                            } 
                        catch (IOException ex) {
                            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                                });
            }
          }, 10000);
    }    
    
    }    
    

