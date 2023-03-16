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
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author fcss
 */
public class BoardController implements Initializable {

    private GraphicsContext gc;
    
    private String[] colors;
    
    private Button[] chalks;
    
    private int size=10;
    
    @FXML
    private Button whiteChalk;
    @FXML
    private Button redChalk;
    @FXML
    private Button greenChalk;
    @FXML
    private Button blueChalk;
    @FXML
    private Button yellowChalk;
    @FXML
    private Button errase;

    
    
    @FXML
    private Canvas canvas;
    @FXML
    private ImageView exit;
    @FXML
    private AnchorPane rootPane;
    
    
    @FXML
    private void chalkClicked(ActionEvent event){
            
        for(int i=0;i<chalks.length ;i++)
        {
            if(chalks[i].getId().equals(((Button) event.getSource()).getId())){
                gc.setFill(Color.web(colors[i]));
                size=10;
                return;
            }
        }
         gc.setFill(Color.web("086C3A"));
         size=100;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       colors =new String[]{"white","red","#32a852","#2482c9","#d9bd0b"};
       
       chalks = new Button[]{whiteChalk,redChalk,greenChalk,blueChalk,yellowChalk};
       
        
       gc = canvas.getGraphicsContext2D();
       
       gc.setFill(Color.web("086c3A"));
       gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
       
       
       gc.setFill(Color.WHITE);
       
       canvas.setOnMouseDragged(new  EventHandler<MouseEvent>(){
           @Override
           public void handle(MouseEvent event) {
               
               gc.fillOval(event.getX(), event.getY(), size, size);
           }
       
       });
       
       
       
         exit.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   //System.out.print("open boeasrdddd");
                   AnchorPane pane1=null; 
                   try {
                       pane1 = FXMLLoader.load(getClass().getResource("Newgame.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(NewgameController.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   rootPane.getChildren().setAll(pane1);
                   event.consume();
               }
          });
    }    
    
}
