/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

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
/**
 *
 * @author mayar abu zeid
 */
public class Scene3 {
    Scene scene;
    Stage stage;
    scene2 scene2;
    Client x;

    
    public void setX(Client x) {
        this.x = x;
    }
    
    public void setScene2(scene2 scene2) {
        this.scene2 = scene2;
    }
    public Scene3(Stage stage) {
        this.stage = stage;
    }
    
    public Scene getScene() {
        return this.scene;
    }
    public void prepareScene(){
    	
        TextField amount=new TextField("Enter amount");
        Button button=new Button("Validate");
         Button back1=new Button("back");
        VBox layout=new VBox(20);
        layout.getChildren().addAll(amount,button,back1);
        scene =new Scene(layout,300,200);
        back1.setOnAction((ActionEvent event) -> {
            
            scene2 newscene = new scene2(stage);
            newscene.setX(x);  
            newscene.prepareScene();
            stage.setScene(newscene.getScene());
        });
        button.setOnAction((ActionEvent event) -> {
            Double add= Double.parseDouble(amount.getText());
                    x.deposit(add);
        });
    }

}
