package com.example.tipcalculatorapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;

public class TipCalculator extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file
        URL fxmlUrl = getClass().getResource("/com/example/tipcalculatorapp/TipCalculator.fxml");
        Parent root = FXMLLoader.load(fxmlUrl);

        // Create a new scene with the loaded layout
        Scene scene = new Scene(root);

        // Load and apply the CSS stylesheet
        scene.getStylesheets().add(getClass().getResource("/com/example/tipcalculatorapp/style.css").toExternalForm());

        // Set up and show the stage
        stage.setTitle("Tip Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
