/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Count_Objects;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author fcss
 */
public class DoneController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GO_MAIN(ActionEvent event) {
        AnchorPane pane1=null; 
        try {
            pane1 = FXMLLoader.load(getClass().getResource("/project/BasicMath.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(Level4Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
       rootPane.getChildren().setAll(pane1);
    }
    
}
