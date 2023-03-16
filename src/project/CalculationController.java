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
public class CalculationController implements Initializable {

    @FXML
    private Button goback;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private ImageView addition;
    @FXML
    private ImageView substraction;
    @FXML
    private ImageView multiplication;
    @FXML
    private ImageView division;
    @FXML
    private ImageView random_img;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         addition.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Calculation/Addition/Level1.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
         
         
         substraction.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   
                   System.out.print("SUbstaraaaaaaaaation");
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Calculation/Subtraction/Level1.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
         
         multiplication.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   
                   System.out.print("SUbstaraaaaaaaaation");
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Calculation/Multiplication/Multplication_table.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
         
         
         
         division.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   
                   System.out.print("SUbstaraaaaaaaaation");
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Calculation/Division/Level1.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
         
              random_img.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   
                   System.out.print("SUbstaraaaaaaaaation");
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Calculation/Random/Level1.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
         
         
         
         
         
    }    

    @FXML
    private void go_back(ActionEvent event) throws IOException {
        AnchorPane pane1 =  FXMLLoader.load(getClass().getResource("Newgame.fxml")); 
       rootPane.getChildren().setAll(pane1);
    }
    
}
