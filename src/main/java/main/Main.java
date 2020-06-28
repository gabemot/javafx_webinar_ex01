package main;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Aplicatia JavaFX porneste...");
    }

    public void start(Stage stage) throws Exception {
        /*
        VBox col1 = new VBox();
        Label label = new Label("Element 1,1");
        col1.getChildren().add(label);
        TextField textField = new TextField("Element 1,2");
        col1.getChildren().add(textField);

        VBox col2 = new VBox();
        col2.getChildren().add(new Label("Element 2,1"));
        col2.getChildren().add(new TextField("Element 2,2"));

        HBox row1 = new HBox();
        row1.getChildren().add(col1);
        row1.getChildren().add(col2);

        row1.setSpacing(10);


        GridPane gridPane = new GridPane();
        gridPane.add(new Button("Buton 1"), 0, 0);
        gridPane.add(new Button("Buton 2"), 1, 0);
        gridPane.add(new Button("Button 3"), 0, 1);
        gridPane.add(new Button("Button 4"), 1, 1);


        ListView<String> listView = new ListView<String>();
        listView.getItems().add("Optiunea 1");
        listView.getItems().add("Optiunea 2");
        listView.getItems().add("Optiunea 3");
        listView.getItems().add("Optiunea 4");

        gridPane.add(listView, 0, 2);
        */

        /*
        TextField textField = new TextField("Text initial");
        System.out.println(textField.getText());
        textField.setText("Text nou");
        System.out.println(textField.getText());

        StringProperty stringProperty = textField.textProperty();
        String textul = stringProperty.getValue();
        stringProperty.addListener( (observable, oldValue, newValue) -> {
            System.out.println("Valoarea s-a schimbat, din " + oldValue + " in " + newValue);
        } );
        */

        /*
        Slider slider = new Slider();
        VBox root = new VBox();
        root.spacingProperty().bind(slider.valueProperty());

        root.getChildren().add(slider);
        Label label = new Label(slider.valueProperty().getValue().toString());

        root.getChildren().add(label);
        */

        /*
        Button button = new Button("Apasa-ma");
        button.setOnAction(event -> System.out.println("Aouch!"));

        TextField textField = new TextField();
        textField.setOnKeyPressed(event -> System.out.println(event.getCode()));

        VBox vBox = new VBox();
        vBox.getChildren().add(button);
        vBox.getChildren().add(textField);
        */

        Parent root = FXMLLoader.load(getClass().getResource("/MainWindow.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Aplicatia JavaFX s-a oprit.");
    }

    public static void main(String[] args) {
        launch();
    }
}
