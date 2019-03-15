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
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mayar abu zeid
 */
public class Scene5 {
    Scene scene;
    Stage stage ;
    Scene6 scene6;    
    scene2 scene2;
    Scene7 scene7;
    Client x;

    public void setX(Client x) {
        this.x = x;
    }
    public void setScene7(Scene7 scene7) {
        this.scene7 = scene7;
    }
    public void setScene6(Scene6 scene6) {
        this.scene6 = scene6;
    }

    public void setScene2(scene2 scene2) {
        this.scene2 = scene2;
    }
    public Scene5(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {
        return this.scene;
    }
    public void prepareScene(){
        Label label=new Label("Enter amount");
        Button button1=new Button("Balance inquiry");
        Button button2=new Button("Previous transactions");
        Button back1=new Button("back");
        VBox layout=new VBox(20);
        layout.getChildren().addAll(label,button1,button2,back1);
        scene =new Scene(layout,300,200);
         back1.setOnAction((ActionEvent event) -> {
//             scene2.setX(x);
//            stage.setScene(scene2.getScene());
             scene2 newscene = new scene2(stage);
             newscene.setX(x);  
              newscene.prepareScene();
              stage.setScene(newscene.getScene());
        });
        button1.setOnAction((ActionEvent event) -> {
//           scene6.setX(x);
//            stage.setScene(scene6.getScene());
            Scene6 newscene = new Scene6(stage);
           newscene.setX(x);  
            newscene.prepareScene();
            stage.setScene(newscene.getScene());
        });
        button2.setOnAction((ActionEvent event) -> {
//            scene6.setX(x);
//            stage.setScene(scene7.getScene());
            Scene7 newscene = new Scene7(stage);
           newscene.setX(x);  
            newscene.prepareScene();
            stage.setScene(newscene.getScene());
        });
    }
    
}
