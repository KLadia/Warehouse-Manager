/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehousemanagementsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class CreateAccountFrameController implements Initializable {
    
    @FXML
    String password;
    
    @FXML
    String username;
    
    @FXML
    String passwordConfirmed;
    
    @FXML
    private void handleCreate(ActionEvent event) throws IOException {
        // after backend is developed an if statement will need to go in this
        // method to catch instance when the passwords do not match
        
        if (password != passwordConfirmed) {
            System.out.println("Your passwords do not match, please try again!");
        }
        else {
            /*try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(
                        "nuserInfo.txt"));
                writer.write(username.getText() + "/"
                        + new String(password.getPassword()));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
        }
        
        // go back to login after account is created
        /*Parent loginFrame = FXMLLoader.load(getClass().getResource("LoginFrame.fxml"));
        Scene loginFrameScene = new Scene(loginFrame);
        Stage getLoginFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
        getLoginFrame.setScene(loginFrameScene);
        getLoginFrame.show();*/
    }
    
    // initialize controller class
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
