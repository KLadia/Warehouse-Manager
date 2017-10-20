/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehousemanagementsystem;

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
    private Label label;
    
    @FXML
    private void handleEmployeeLogin(ActionEvent event) throws IOException {
        Parent employeeFrame = FXMLLoader.load(getClass().getResource("EmployeeFrame.fxml"));
        Scene employeeFrameScene = new Scene(employeeFrame);
        Stage getEmployeeFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
        getEmployeeFrame.setScene(employeeFrameScene);
        getEmployeeFrame.show(); 

    }
    
    @FXML
    private void handleManagerLogin(ActionEvent event) throws IOException {
        Parent managerFrame = FXMLLoader.load(getClass().getResource("ManagerFrame.fxml"));
        Scene managerFrameScene = new Scene(managerFrame);
        Stage getManagerFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
        getManagerFrame.setScene(managerFrameScene);
        getManagerFrame.show();

    }
    
    @FXML
    private void handleCreateAccount(ActionEvent event) throws IOException {
        Parent createAccountFrame = FXMLLoader.load(getClass().getResource("CreateAccountFrame.fxml"));
        Scene createAccountScene = new Scene(createAccountFrame);
        Stage getCreateAccountFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
        getCreateAccountFrame.setScene(createAccountScene);
        getCreateAccountFrame.show();
        
    }
    
    // initilize controller class
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
