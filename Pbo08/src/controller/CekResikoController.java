/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import mapping.Hasil;

/**
 * FXML Controller class
 *
 * @author MZ17
 */
public class CekResikoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private RadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20;
      @FXML
    private RadioButton r21,r22,r23,r24,r25,r26,r27,r28,r29,r30,r31,r32,r33,r34,r35,r36,r37,r38,r39,r40,r41,r42;
     @FXML
    private Button cek;
       int i=0;
        String hasil;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      radio();
    }    
    public void radio(){
        
        ToggleGroup t1 = new ToggleGroup();
        ToggleGroup t2 = new ToggleGroup();
        ToggleGroup t3 = new ToggleGroup();
        ToggleGroup t4 = new ToggleGroup();
        ToggleGroup t5 = new ToggleGroup();
        ToggleGroup t6 = new ToggleGroup();
        ToggleGroup t7 = new ToggleGroup();
        ToggleGroup t8 = new ToggleGroup();
        ToggleGroup t9 = new ToggleGroup();
        ToggleGroup t10 = new ToggleGroup();
        ToggleGroup t11 = new ToggleGroup();
        ToggleGroup t12 = new ToggleGroup();
        ToggleGroup t13 = new ToggleGroup();
        ToggleGroup t14 = new ToggleGroup();
        ToggleGroup t15 = new ToggleGroup();
        ToggleGroup t16 = new ToggleGroup();
        ToggleGroup t17 = new ToggleGroup();
        ToggleGroup t18 = new ToggleGroup();
        ToggleGroup t19= new ToggleGroup();
        ToggleGroup t20 = new ToggleGroup();
        ToggleGroup t21 = new ToggleGroup();
        
        
        
              
        r1.setToggleGroup(t1); 
        r2.setToggleGroup(t1);
        
        r3.setToggleGroup(t2); 
        r4.setToggleGroup(t2);
        
        r5.setToggleGroup(t3); 
        r6.setToggleGroup(t3);
        
        r7.setToggleGroup(t4); 
        r8.setToggleGroup(t4);
        
        r9.setToggleGroup(t5); 
        r10.setToggleGroup(t5);
        
        r11.setToggleGroup(t6); 
        r12.setToggleGroup(t6);
        
        r13.setToggleGroup(t7); 
        r14.setToggleGroup(t7);
        
        r15.setToggleGroup(t8); 
        r16.setToggleGroup(t8);
        
        r17.setToggleGroup(t9); 
        r18.setToggleGroup(t9);
        
        r19.setToggleGroup(t10); 
        r20.setToggleGroup(t10);
        
        r21.setToggleGroup(t11); 
        r22.setToggleGroup(t11);
        
        r23.setToggleGroup(t12); 
        r24.setToggleGroup(t12);
        
        r25.setToggleGroup(t13); 
        r26.setToggleGroup(t13);
        
        r27.setToggleGroup(t14); 
        r28.setToggleGroup(t14);
        
        r29.setToggleGroup(t15); 
        r30.setToggleGroup(t15);
        
        r31.setToggleGroup(t16); 
        r32.setToggleGroup(t16);
        
        r33.setToggleGroup(t17); 
        r34.setToggleGroup(t17);
        
        r35.setToggleGroup(t18); 
        r36.setToggleGroup(t18);
        
        r37.setToggleGroup(t19); 
        r38.setToggleGroup(t19);
        
        r39.setToggleGroup(t20); 
        r40.setToggleGroup(t20);
        
        r41.setToggleGroup(t21); 
        r42.setToggleGroup(t21);
        
      
         t1.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t1.getSelectedToggle() != null) {
            i+=1;
          r1.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();    
          
        }
      }
      
    });
         t2.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t2.getSelectedToggle() != null) {
            i+=1;
          r3.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         
         t3.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t3.getSelectedToggle() != null) {
            i+=1;
            
          r5.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         
         t4.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t4.getSelectedToggle() != null) {
            i+=1;
          r7.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         
         t5.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t5.getSelectedToggle() != null) {
            i+=1;
          r9.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         
         t6.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t6.getSelectedToggle() != null) {
            i+=1;
          r11.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
    
         t7.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t7.getSelectedToggle() != null) {
            i+=1;
          r13.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
    
         t8.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t8.getSelectedToggle() != null) {
            i+=1;
          r15.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
    
         t9.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t9.getSelectedToggle() != null) {
            i+=1;
          r17.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         
         t10.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t10.getSelectedToggle() != null) {
            i+=1;
          r19.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t11.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t11.getSelectedToggle() != null) {
            i+=1;
          r21.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t12.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t12.getSelectedToggle() != null) {
            i+=1;
          r23.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t13.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t13.getSelectedToggle() != null) {
            i+=1;
          r25.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t14.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t14.getSelectedToggle() != null) {
            i+=1;
          r27.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t15.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t15.getSelectedToggle() != null) {
            i+=1;
          r29.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t16.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t16.getSelectedToggle() != null) {
            i+=1;
          r31.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t17.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t17.getSelectedToggle() != null) {
            i+=1;
          r33.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t18.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t18.getSelectedToggle() != null) {
            i+=1;
          r35.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t19.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t19.getSelectedToggle() != null) {
            i+=1;
          r37.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t20.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t20.getSelectedToggle() != null) {
            i+=1;
          r39.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();          
        }
      }
    });
         t21.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      public void changed(ObservableValue<? extends Toggle> ov,
          Toggle old_toggle, Toggle new_toggle) {
        if (t21.getSelectedToggle() != null) {
            i+=1;
          r41.setUserData(i);
          String i =t1.getSelectedToggle().getUserData().toString();  
        } 
      }
    });
     
        
        cek.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Hasil hasilcek = new  Hasil();
                if (i>=15) {
                    hasil = "Resiko Tinggi";
                }else if(i>=8 && i<=14){
                    hasil = "Resiko Sedang";
                }else{
                    hasil = "Resiko rendah";
                }
                hasilcek.setHasil(hasil);
                hasilcek.setNama("Martin Simanjuntak");
                Date dateNow = new Date();
                
                if (i>=15) {
                    hasil = "Resiko Tinggi";
                }else if(i>=8 && i<=14){
                    hasil = "Resiko Sedang";
                }else if(i<8){
                    hasil = "Resiko rendah";
                }
                
                Parent Login;
                String hasil1 = hasil;
                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("/view/HasilTest.fxml"));
                    loader.load();
                    HasilTestController  hasil = loader.getController();
                    hasil.getHasil(hasil1);
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
