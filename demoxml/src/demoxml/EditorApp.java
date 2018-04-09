/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author balavivek
 */
public class EditorApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
        loader.setControllerFactory(t -> new EditorController(new EditorModel()));
        
        stage.setScene(new Scene(loader.load()));
        
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
