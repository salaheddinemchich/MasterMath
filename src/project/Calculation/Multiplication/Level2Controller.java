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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author fcss
 */
public class Level2Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private ImageView resultimg;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private Label Label_Error;
    String resultvalue;
    @FXML
    private ImageView error_image;
    @FXML
    private ImageView next_button;
    @FXML
    private ImageView img1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         next_button.setVisible(false);
        error_image.setVisible(false);
    }    

    @FXML
    private void resultimage_drag_over(DragEvent event) {
           if(event.getDragboard().hasImage())
               {
                   event.acceptTransferModes(TransferMode.ANY);
                }
    }

    @FXML
    private void result_image_frag_dropped(DragEvent event) {
         Image img = event.getDragboard().getImage();
       
        if(resultvalue.equals("not correct"))
        {
            Label_Error.setText("             Sorry , Try Again");
            Label_Error.setStyle("-fx-text-fill:red;");
            error_image.setVisible(true);
            //resultimg.setImage(img);
             next_button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   System.out.println("Opened Next Level");
                   event.consume();
               }
          });
            
            
        }
        else{
            Label_Error.setText("Good Job , Go To Next Level");
             Label_Error.setStyle("-fx-text-fill:light green;");
            next_button.setVisible(true);
            error_image.setVisible(false);
            resultimg.setImage(img);
            img1.setDisable(true);
            img2.setDisable(true);
            img3.setDisable(true);
            img1.setOpacity(0.5);
            img2.setOpacity(0.5);
            img3.setOpacity(0.5);
            
            
            
            next_button.setDisable(false);
             next_button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

               @Override
               public void handle(MouseEvent event) {
                   
                   AnchorPane pane=null; 
                   try {
                       pane = FXMLLoader.load(getClass().getResource("Level3.fxml"));
                   } catch (IOException ex) {
                       Logger.getLogger(project.Count_Objects.Level1Controller.class.getName()).log(Level.SEVERE, null, ex);
                   }
                    rootPane.getChildren().setAll(pane);
               }
          });
        
            
        }
    }

    @FXML
    private void go_back(ActionEvent event) throws IOException {
        AnchorPane pane1 =  FXMLLoader.load(getClass().getResource("/project/Calculation.fxml")); 
       rootPane.getChildren().setAll(pane1);
       
    }

    @FXML
    private void img1_drag_detected(MouseEvent event) {
        Dragboard db = img1.startDragAndDrop(TransferMode.ANY);
      
        ClipboardContent cb = new ClipboardContent();
        
        cb.putImage(img1.getImage());
        
        db.setContent(cb);
        
        event.consume();
        
        resultvalue="not correct";
        
    }

    @FXML
    private void img2_drag_detected(MouseEvent event) {
        Dragboard db = img2.startDragAndDrop(TransferMode.ANY);
      
        ClipboardContent cb = new ClipboardContent();
        
        cb.putImage(img2.getImage());
        
        db.setContent(cb);
        
        event.consume();
        
        resultvalue="not correct";
        
        
    }

    @FXML
    private void img3_drag_detected(MouseEvent event) {
         Dragboard db = img3.startDragAndDrop(TransferMode.ANY);
      
        ClipboardContent cb = new ClipboardContent();
        
        cb.putImage(img3.getImage());
        
        db.setContent(cb);
        
        event.consume();
        
        resultvalue="correct";
    }
    
}
