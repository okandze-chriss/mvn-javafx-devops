package com.softwify;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.logging.Logger;

/**
 * Javafx Hello world!
 *
 */
public class HelloWorld extends Application
{
    static final Logger LOGGER = Logger.getLogger(String.valueOf(HelloWorld.class));
    public static void main( String[] args )
    {
        launch(args);
        LOGGER.info( "Hello World!" );
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        //event -> System.out.println("Hello World!")
        btn.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        stage.setScene(new Scene(root, 300, 250));
        stage.show();
    }
}
