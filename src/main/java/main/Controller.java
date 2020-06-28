package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public void candSuntCuMouseulPesteButon(MouseEvent mouseEvent) {
        System.out.println("Ai trecut cu mouse-ul peste mine");
    }

    public void candAmApasatPeButon(MouseEvent mouseEvent) {
        System.out.println("Au, ai apasat prea tare!");
    }

    public void candAmTastatInCampulText(KeyEvent keyEvent) {
        System.out.println("Ai tastat " + keyEvent.getText());
    }

    public void candAmPlecatDePeButon(MouseEvent mouseEvent) {
        System.out.println("De ce pleci?");
    }

    public void deschideOfereastraNoua(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/SecondWindow.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
        stage.setTitle("A doua fereastra");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
}
