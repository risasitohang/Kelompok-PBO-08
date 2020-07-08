/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pbo08.datafetch.model.ResponseUser;
import pbo08.datafetch.model.userModel;
import retrofit.ApiClient;
import retrofit.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * FXML Controller class
 *
 * @author MZ17
 */
public class LoginController implements Initializable {

     @FXML
    private TextField tfEmail;

    @FXML
    private Button btn_login;

    @FXML
    private Button btn_reset;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private Label Eemail;

    @FXML
    private Label EPass;

    @FXML
    void ButtonLogin(ActionEvent event) {
        String userr = tfEmail.getText().toString();
        String pass  = tfPassword.getText().toString();
        ApiInterface api = ApiClient.getRetrofit().create(ApiInterface.class);
            Call<ResponseUser> call = api.postLogin(
                    userr,
                    pass
            );
           call.enqueue(new Callback<ResponseUser>() {
            @Override
            public void onResponse(Call<ResponseUser> call, Response<ResponseUser> rspns) {
                 Platform.runLater(()->{
                    if (rspns.isSuccessful()){
                   
                        List<userModel> user = rspns.body().getData();
                        Preferences pengguna = Preferences.userRoot();
                        int tes = rspns.body().getData().size();
                        int x= 0;
                   
                         if (tes>0){
                            for (int i=0 ; i<tes; i++){
                                if (user.get(i).getUsername().equals(userr)) {
                                    if (user.get(i).getPassword().equals(pass)) {
                                            try {
                                                 Parent root;
                                                pengguna.put("username",user.get(i).getUsername());
                                                pengguna.put("nama", user.get(i).getNama());
                                                Parent Login = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
                                                Scene sceneLogin = new Scene(Login);
                                                Stage stageLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
                                                stageLogin.setScene(sceneLogin);
                                                stageLogin.show();
                                                x=0;
                                            } catch (IOException ex) {
                                                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                                            }     
                                    }
                                    else{
                                        x=1;
                                    }
                                    
                                }else{
                                    x=2;
                                }
                            }
                             if (x==2) {
                                 EPass.setText("");
                                 Eemail.setText("Username Anda salah");
                             }
                        else if (x==1){
                                 Eemail.setText("");
                                 EPass.setText("Password Anda Salah");
                        }
                       
                    }
                    }
                });
            }

            @Override
            public void onFailure(Call<ResponseUser> call, Throwable thrwbl) {
                System.out.println("Gagal "+thrwbl.getMessage());
            }
        });

    }

    @FXML
    void ButtonReset(ActionEvent event) {
       tfEmail.setText("");
       tfPassword.setText("");
       Eemail.setText("");
       EPass.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EPass.setText("");
        Eemail.setText("");
    }    
 
}
