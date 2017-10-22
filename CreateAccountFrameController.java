/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehousemanagementsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateAccountFrameController implements Initializable {
    private String storedUsername;
    private String storedPassword;
    
    @FXML
    private RadioButton chooseEmployee;
    
    @FXML
    private RadioButton chooseManager;
    
    @FXML
    private Label chooseManagerOrEmployee;
    
    @FXML
    private Label emptyFields;
    
    @FXML
    private Label matchingPassword;
    
    @FXML
    private TextField userNameField;
    
    @FXML
    private TextField passwordField;
    
    @FXML
    private TextField confirmField;
    
    @FXML
    private void handleCreate(ActionEvent event) throws IOException {
        if ((userNameField.getText().equals("")) || (passwordField.getText().equals(""))
                || (confirmField.getText().equals("")) || 
                (!((passwordField.getText()).equals(confirmField.getText())))) {
            emptyFields.setText("Please fill in all fields");
            
            // neither account options are selected
            if(!(chooseEmployee.isSelected()) && !(chooseManager.isSelected())) {
                chooseManagerOrEmployee.setText("Please choose an account type");
            } 
            // one of the account options are selected (label hidden)
            if(chooseEmployee.isSelected() || chooseManager.isSelected()) {
                chooseManagerOrEmployee.setText(" ");
            }
        
            if(!((passwordField.getText()).equals(confirmField.getText()))) {
                emptyFields.setText(" ");
                matchingPassword.setText("Passwords do not match");
            } else {
                matchingPassword.setText(" ");
            }
        }
        else { // go to login if all fields are filled and store info
            if(chooseEmployee.isSelected()) {
                storedUsername = userNameField.getText();
                storedPassword = passwordField.getText();
            
                File storedData = new File("StoredDataEmployee.txt");
            
                try {
                    FileWriter data = new FileWriter(storedData, true);
                    BufferedWriter storeData = new BufferedWriter(data);
                    storeData.append(storedUsername);
                    storeData.newLine();
                    storeData.append(storedPassword);
                    storeData.newLine();
                    storeData.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(chooseManager.isSelected()) {
                storedUsername = userNameField.getText();
                storedPassword = passwordField.getText();
            
                File storedData = new File("StoredDataManager.txt");
            
                try {
                    FileWriter data = new FileWriter(storedData, true);
                    BufferedWriter storeData = new BufferedWriter(data);
                    storeData.append(storedUsername);
                    storeData.newLine();
                    storeData.append(storedPassword);
                    storeData.newLine();
                    storeData.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            Parent loginFrame = FXMLLoader.load(getClass().getResource("LoginFrame.fxml"));
            Scene loginFrameScene = new Scene(loginFrame);
            Stage getLoginFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
            getLoginFrame.setScene(loginFrameScene);
            getLoginFrame.show();
        }
    }
    
    // initialize controller class
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
