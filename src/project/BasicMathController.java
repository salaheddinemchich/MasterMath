/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

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
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author fcss
 */
public class BasicMathController implements Initializable {

    @FXML
    private AnchorPane rootpane;
    @FXML
    private Button goback;
    @FXML
    private ImageView compare;
    @FXML
    private ImageView count_objects;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        count_objects.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Count_Objects/Level1.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootpane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
        
        compare.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Comapre_Numbers/Level1.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootpane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
        
        
    }    

    @FXML
    private void goback_action(ActionEvent event) throws IOException {
         AnchorPane pane1 =  FXMLLoader.load(getClass().getResource("Newgame.fxml")); 
       rootpane.getChildren().setAll(pane1);
    }
    
}
