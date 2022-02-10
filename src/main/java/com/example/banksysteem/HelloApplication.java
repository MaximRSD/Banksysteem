package com.example.banksysteem;

import com.example.banksysteem.classes.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane root = new GridPane();
        ComboBox cmbRekening = new ComboBox();
        cmbRekening.getItems().add("Spaarrekening");
        cmbRekening.getItems().add("Kinderspaarrekening");
        cmbRekening.getItems().add("Betaalrekening");

        Bank deBank = new Bank();
        TextField txtRekeningnr = new TextField();
        TextField txtSaldo = new TextField();

        Button btnOpen = new Button("Open");
        btnOpen.setOnAction(e->{

            switch(cmbRekening.getValue().toString())
            {
                case "BetaalRekening": BetaalRekening br = new BetaalRekening(txtRekeningnr.getText(), Double.parseDouble(txtSaldo.getText()));
                                        deBank.addRek(br);
                                        break;
                case "SpaarRekening": SpaarRekening sr = new SpaarRekening(txtRekeningnr.getText(), Double.parseDouble(txtSaldo.getText()));
                                        deBank.addRek(sr);
                                        break;
                case "KinderSpaarRekening": KinderspaarRekening ksr = new KinderspaarRekening(txtRekeningnr.getText(), Double.parseDouble(txtSaldo.getText()));
                                        deBank.addRek(ksr);
                                        break;
            }
        });

        root.add(cmbRekening, 0, 1);
        root.add(txtRekeningnr, 0, 2);
        root.add(txtSaldo, 0, 3);
        root.add(btnOpen, 0, 4);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}