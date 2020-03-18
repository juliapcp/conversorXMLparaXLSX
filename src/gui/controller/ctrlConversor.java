package gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import logica.lConversorXML;

import javax.swing.*;
import java.io.File;

public class ctrlConversor extends AnchorPane {
    Stage primaryStage;

    @FXML
    private Button botaoUpload;

    @FXML
    void botaoUploadClick(ActionEvent event) throws Exception {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Arquivos XML", "*.xml")
        );
        File arquivoSelecionado = (File) fileChooser.showOpenDialog(getPrimaryStage());
        if(arquivoSelecionado != null) {
            lConversorXML.leArquivo(arquivoSelecionado);
        }
    }

    public ctrlConversor(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/design/dsConversorUpload.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
