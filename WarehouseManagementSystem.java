/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehousemanagementsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author chelseaatkins
 */
public class WarehouseManagementSystem extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginFrame.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    private void readFile(){

        File storedData = new File("StoredData.txt");
        try{
            FileReader readStoredData = new FileReader(storedData);
            BufferedReader br = new BufferedReader(readStoredData);
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
