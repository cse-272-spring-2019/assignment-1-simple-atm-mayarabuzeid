/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

/**
 *
 * @author mayar abu zeid
 */

import javafx.scene.control.Label;
import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class scene2 {
    Scene scene;
    Stage stage;
   Scene3 scene3;
   Scene4 scene4;
   Scene5 scene5;
   Client x;

    public void setX(Client x) {
        this.x = x;
    }
    public void setScene5(Scene5 scene5) {
        this.scene5 = scene5;
    }
    public scene2(Stage stage) {
            this.stage = stage;    }
    public void setScene3(Scene3 scene3) {
        this.scene3 = scene3;
    }
    public void setScene4(Scene4 scene4) {
        scene4.setX(x);
        this.scene4 = scene4;
    }
    public Scene getScene() {
        return this.scene;
    }
    public void prepareScene(){
        
    	Label label=new Label("WELCOME\nwhat do you want to do?");
        Button button1=new Button("Deposite");
        Button button2=new Button("Withdraw");
        Button button3=new Button("Other iquries");
        VBox layout=new VBox(30);
        layout.getChildren().addAll(label,button1,button2,button3);
        button1.setOnAction((ActionEvent event) -> {    
            Scene3 newscene = new Scene3(stage);
            newscene.setX(x);  
            newscene.prepareScene();
            stage.setScene(newscene.getScene());
            
            
        });
        button2.setOnAction((ActionEvent event) -> {
            Scene4 newscene = new Scene4(stage);
           newscene.setX(x);  
            newscene.prepareScene();
            stage.setScene(newscene.getScene());
        });
        button3.setOnAction((ActionEvent event) -> {
            Scene5 newscene = new Scene5(stage);
           newscene.setX(x);  
            newscene.prepareScene();
            stage.setScene(newscene.getScene());
        });
       scene=new Scene(layout,300,200);
    }    
}
