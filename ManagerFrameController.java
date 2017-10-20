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

/**
 * FXML Controller class
 *
 * @author chelseaatkins
 */
public class ManagerFrameController implements Initializable {

    @FXML
    private void handleLogout(ActionEvent event) throws IOException {
        Parent logoutFrame = FXMLLoader.load(getClass().getResource("LogoutFrame.fxml"));
        Scene logoutFrameScene = new Scene(logoutFrame);
        Stage getLogoutFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
        getLogoutFrame.setScene(logoutFrameScene);
        getLogoutFrame.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
