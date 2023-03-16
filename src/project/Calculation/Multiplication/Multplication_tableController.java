/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Calculation.Multiplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import project.NewgameController;

/**
 * FXML Controller class
 *
 * @author fcss
 */
public class Multplication_tableController implements Initializable {

    @FXML
    private ImageView next_button;
    @FXML
    private AnchorPane rootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       next_button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   
                
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Level1.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
    }    

    @FXML
    private void go_back(ActionEvent event) {
    }

    
    
}
