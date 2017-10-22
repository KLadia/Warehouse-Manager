/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehousemanagementsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginFrameController implements Initializable {
    @FXML
    private Label notification;
    
    @FXML
    private TextField userNameField;
    
    @FXML
    private TextField passwordField;
    
    @FXML
    private Label emptyFieldsEmp;
    
    @FXML
    private TextField userNameFieldEmp;
    
    @FXML
    private TextField passwordFieldEmp;
    
    @FXML
    private Label incorrectInfo;
    
    @FXML
    private void handleEmployeeLogin(ActionEvent event) throws IOException {
        if((userNameFieldEmp.getText().equals("")) || (passwordFieldEmp.getText().equals(""))) {
            emptyFieldsEmp.setText("Please fill in all fields");
        }
        /*if() {
            emptyFieldsEmp.setText("Incorrect username or password");
        }*/
        else {
            Parent employeeFrame = FXMLLoader.load(getClass().getResource("EmployeeFrame.fxml"));
            Scene employeeFrameScene = new Scene(employeeFrame);
            Stage getEmployeeFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
            getEmployeeFrame.setScene(employeeFrameScene);
            getEmployeeFrame.show(); 
        }
    }
    
    @FXML
    private void handleManagerLogin(ActionEvent event) throws IOException {
        
        File storedDataManager = new File("StoredDataManager.txt");
        try{
            FileReader readData = new FileReader(storedDataManager);
            BufferedReader readManagerData = new BufferedReader(readData);
            while(readManagerData.ready()){
                if(((readManagerData.readLine()).equals(userNameField.getText()))) {
                    notification.setText(" ");
                    incorrectInfo.setText("Incorrect username or password");
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }

        if((userNameField.getText().equals("")) || (passwordField.getText().equals(""))) {
            notification.setText("Please fill in all fields");
        }
        
        else {
            Parent managerFrame = FXMLLoader.load(getClass().getResource("ManagerFrame.fxml"));
            Scene managerFrameScene = new Scene(managerFrame);
            Stage getManagerFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
            getManagerFrame.setScene(managerFrameScene);
            getManagerFrame.show();
        }

    }
    
    // initialize controller class
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
