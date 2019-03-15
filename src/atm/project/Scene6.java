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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mayar abu zeid
 */
public class Scene6 {
    Scene scene;
    Stage stage;
    Scene5 scene5;
    Client x;

    public void setX(Client x) {
        this.x = x;
    }
    
    public void setScene5(Scene5 scene5) {
        this.scene5 = scene5;
    }
    public Scene6(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {
        return scene;
    }
    
     public void prepareScene(){
        Label label=new Label("your current balance is "+x.getBalance());
        Button button=new Button("back");
        VBox layout=new VBox(20);
        layout.getChildren().addAll(label,button);
        scene =new Scene(layout,300,200);
    button.setOnAction((ActionEvent event) -> {
        Scene5 newscene = new Scene5(stage);
       newscene.setX(x);  
        newscene.prepareScene();
        stage.setScene(newscene.getScene());
        });
     }
     
}
