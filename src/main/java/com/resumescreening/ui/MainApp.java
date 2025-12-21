package com.resumescreening.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Main Entry Point for the JavaFX Application.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Intelligent Resume Screening System");

        try {
            java.io.InputStream is = getClass().getResourceAsStream("/images/logo.png");
            if (is != null) {
                primaryStage.getIcons().add(new Image(is));
            }
        } catch (Exception e) {
            System.err.println("Could not load icon: " + e.getMessage());
        }

        GUIController controller = new GUIController(primaryStage);
        VBox root = controller.createLayout();

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
