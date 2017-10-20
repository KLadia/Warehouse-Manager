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
import javafx.stage.Stage;

public class LogoutFrameController implements Initializable {

    @FXML
    private void handleBackToLogin(ActionEvent event) throws IOException {
        Parent loginFrame = FXMLLoader.load(getClass().getResource("LoginFrame.fxml"));
        Scene loginFrameScene = new Scene(loginFrame);
        Stage getLoginFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
        getLoginFrame.setScene(loginFrameScene);
        getLoginFrame.show();
    }
    
    // initialize the controller class
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
