package com.softwify;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
    public void start(Stage stage) {
        stage.setTitle("Hello World app");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");

        Text helloWorld = new Text();
        helloWorld.setText("Welcome to my Hello World App ");
        helloWorld.setFont(Font.font("Verdana", FontWeight.BOLD, 16));

        StackPane root2 = new StackPane();
        root2.getChildren().add(helloWorld);


        //event -> System.out.println("Hello World!")
        btn.setOnAction(event -> {
            LOGGER.info("Hello World!");
            stage.setScene(new Scene(root2, 300, 250));
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        stage.setScene(new Scene(root, 300, 250));
        stage.show();
    }
}
