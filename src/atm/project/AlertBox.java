/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author mayar abu zeid
 */
public class AlertBox {
    Scene scene;
    Stage stage;
    AtmProject scene1;
    public AlertBox(Stage stage) {
        this.stage = stage;
    }
    public Scene getScene() {
        return this.scene;
    }

    public void setScene1(AtmProject scene1) {
        this.scene1 = scene1;
    }
    public void prepareScene(){
Label label=new Label("You have entered wrong card number");
Button button=new Button("Try again");
VBox layout=new VBox(20);
layout.getChildren().addAll(label,button);
 scene =new Scene(layout,300,200);
     
    button.setOnAction((ActionEvent event) -> {
        AtmProject newscene = new AtmProject(stage);
        newscene.prepareScene();
        stage.setScene(newscene.getScene());    
        });
}
}