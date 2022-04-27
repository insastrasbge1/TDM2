/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.toto.tdm2.boiteACoucou;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author francois
 */
public class MainFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BoiteACoucouPanel main = new BoiteACoucouPanel();
        Scene sc = new Scene(main);
        stage.setScene(sc);
        stage.setTitle("Boite à Coucou");
          stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
