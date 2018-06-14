/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlo.mavenproject1;

import com.jfoenix.controls.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.*;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Windows
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton btn_submit;
    
    @FXML
    private JFXTextField usernameField;

    @FXML
    private JFXPasswordField passwordField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
   

    @FXML
    void submitClicked(ActionEvent event) 
    {
         if(isInputsValid(usernameField.getText().toString(), passwordField.getText()))
             JOptionPane.showMessageDialog(null, "Correct");
    }
    
    private boolean isInputsValid(String username, String password)
    {
        if(username.trim().isEmpty() || password.isEmpty())
             JOptionPane.showMessageDialog(null, "Don't leave blank spaces", "Null fields", JOptionPane.WARNING_MESSAGE);
         else
         {
             if(username.trim().equals("admin")&& password.trim().equals("123"))
                 return true;
             else
                 JOptionPane.showMessageDialog(null, "Wrong inputs", "Wrong", JOptionPane.ERROR_MESSAGE);
         }
        return false;
    }
}
