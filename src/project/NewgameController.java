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
public class NewgameController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button goback;
    @FXML
    private ImageView basic_math;
    @FXML
    private ImageView calculation;
    @FXML
    private ImageView geometrie;
    @FXML
    private ImageView board_img;
    
    
    @FXML
    private void goback_click(ActionEvent event) throws IOException {
        AnchorPane pane1 =  FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")); 
       rootPane.getChildren().setAll(pane1);
    }
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         basic_math.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("BasicMath.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
         
          calculation.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                    AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Calculation.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
          
           geometrie.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Geometrie/Level1.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
        
            board_img.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   System.out.print("open boeasrdddd");
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Board.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
        
        
        
    }    

    

    
}
