package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;


public class FXMLDocumentController implements Initializable {
    int i=0;
    @FXML
    private Button new_game;
    @FXML
    private Button option;
    @FXML
    private Button exit_game;
    @FXML
    AnchorPane rootPane;
  
    

    
   @FXML 
    private void NewGame_Click(ActionEvent event) throws IOException {
        AnchorPane pane =  FXMLLoader.load(getClass().getResource("Newgame.fxml")); 
       rootPane.getChildren().setAll(pane);
    }
   @FXML 
    private void Option_Click(ActionEvent event) throws IOException {
         AnchorPane pane1 =  FXMLLoader.load(getClass().getResource("Option.fxml"));
        rootPane.getChildren().setAll(pane1);
    }
   @FXML 
    private void Exit_Game_Click(ActionEvent event) {
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {}   

}
