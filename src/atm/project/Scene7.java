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
public class Scene7 {
    Scene scene;
    Stage stage;
    scene2 scene2;
    Client x;
    int y=0;
    public void setX(Client x) {
        this.x = x;
    }
    
    public void setScene2(scene2 scene2) {
        this.scene2 = scene2;
    }
    public Scene7(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {
        return scene;
    }
public void prepareScene(){
    
Label label=new Label("Your transaction: "+x.history(0));
Button button1=new Button("previous transactions");
Button button2=new Button("next transactions");
Button button3=new Button("back to menu");
VBox layout=new VBox(20);
layout.getChildren().addAll(label,button1,button2,button3);
scene=new Scene(layout,300,200);
 button3.setOnAction((ActionEvent event) -> {
     scene2 newscene = new scene2(stage);
    newscene.setX(x);  
     newscene.prepareScene();
     stage.setScene(newscene.getScene());
        });
 button1.setOnAction((ActionEvent event) -> {
     if(y>4){
     label.setText("No previous transactions");
     }
         label.setText("Your transaction: "+x.history(++y));
        });
 button2.setOnAction((ActionEvent event) -> {
     if(y==0)
     {label.setText("Your transaction: "+x.history(0));}
      else
         label.setText("Your transaction: "+x.history(--y));
        });
}    
}
