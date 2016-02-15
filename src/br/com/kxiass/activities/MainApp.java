package br.com.kxiass.activities;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.kairos.components.MaterialButton;
import org.kairos.core.ActivityFactory;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        StackPane root=new StackPane(); // Create root pane
        stage.setScene(new Scene(root)); // Set the scene in the stage

        // this object represent the stack  of activities  in your application
        ActivityFactory factory=new ActivityFactory(stage);

        // set the material design style in your application
        stage.getScene().getStylesheets().add(MaterialButton.class.getResource("controls.css").toExternalForm());
        stage.getScene().getStylesheets().add(MaterialButton.class.getResource("/resources/app_style.css").toExternalForm());

        factory.startActivity(MainActivity.class); // start the activity
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
