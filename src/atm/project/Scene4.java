/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mayar abu zeid
 */
public class Scene4 {
    Scene scene;
    Stage stage;
    scene2 scene2;
    Client x;
    Sceen7 sceen7;

    public void setSceen7(Sceen7 sceen7) {
        this.sceen7 = sceen7;
    }
    public void setX(Client x) {
        this.x = x;
    }
    
    public void setScene2(scene2 scene2) {
        this.scene2 = scene2;
    }
    
    public Scene4(Stage stage) {
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
            Double sub= Double.parseDouble(amount.getText());
            if(sub>x.getBalance()){
                Sceen7 newscene = new Sceen7(stage);
                newscene.setX(x);  
                newscene.prepareScene();
                stage.setScene(newscene.getScene()); }
            else
                x.withdraw(sub);
        });
    }
}
