package principal;

import gui.controller.ctrlConversor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene;
        ctrlConversor oCtrlConversor = new ctrlConversor(primaryStage);
        scene = new Scene(oCtrlConversor);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Conversor de XML para NFE");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}

