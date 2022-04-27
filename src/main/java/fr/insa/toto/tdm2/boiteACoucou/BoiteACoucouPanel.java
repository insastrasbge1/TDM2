/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.toto.tdm2.boiteACoucou;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 * 
 * @author francois
 */
public class BoiteACoucouPanel extends BorderPane{
    
    private BorderPane bpNom;
    private Label lNom;
    private TextField tfNom;
    
    private TextArea taMessages;
    
    private HBox hbButtons;
    private Button bCoucou;
    private Button bSalut;
    
    public BoiteACoucouPanel() {
        this.lNom = new Label("nom :");
        this.tfNom = new TextField();
        this.bpNom = new BorderPane();
        this.bpNom.setLeft(this.lNom);
        this.bpNom.setCenter(this.tfNom);
        this.setTop(this.bpNom);
        
        this.taMessages = new TextArea();
        this.setCenter(this.taMessages);
        
        this.bCoucou = new Button("coucou");
        this.bCoucou.setOnAction((t) -> {
            this.taMessages.appendText("coucou " + 
                    this.tfNom.getText() + "\n");
        });
        this.bSalut = new Button("salut");
        this.bSalut.setOnAction((t) -> {
            this.taMessages.appendText("salut " + 
                    this.tfNom.getText() + "\n");
        });
        this.hbButtons = new HBox(this.bCoucou,this.bSalut);
        this.setBottom(this.hbButtons);
    }
    
}
