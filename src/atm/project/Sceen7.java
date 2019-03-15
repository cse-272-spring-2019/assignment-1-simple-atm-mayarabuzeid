/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mayar abu zeid
 */
public class Sceen7 {
    Stage stage;
    Scene scene;
    Scene4 scene4;
    Client x;

    public void setX(Client x) {
        this.x = x;
    }
    
    public void setScene4(Scene4 scene4) {
        this.scene4 = scene4;
    }

    public Scene getScene() {
        return scene;
    }

    public Sceen7(Stage stage) {
        this.stage = stage;
    }
    public void prepareScene(){
Label label=new Label("You have entered more than the amount in your balance");
Button button=new Button("Try again");
VBox layout=new VBox(20);
layout.getChildren().addAll(label,button);
 scene =new Scene(layout,300,200);
     
    button.setOnAction((ActionEvent event) -> {
        Scene4 newscene = new Scene4(stage);
        newscene.setX(x);  
        newscene.prepareScene();
        stage.setScene(newscene.getScene());    
        });
}
}
