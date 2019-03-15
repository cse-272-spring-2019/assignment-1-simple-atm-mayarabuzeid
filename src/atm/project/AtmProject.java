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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mayar abu zeid
 */
public class AtmProject  {
    Scene scene;
    scene2 scene2;
    Stage stage;
    AlertBox alert;
    Client x=new Client(0);
    public void setAlert(AlertBox alert) {
        this.alert = alert;
    }
    public AtmProject(Stage stage) {
        this.stage = stage;
    }
    public void setScene2(scene2 scene2) {
        this.scene2 = scene2;
    }
    public Scene getScene(){
        return this.scene;
}
   validate v= new validate();
    public void prepareScene() {
        Button button=new Button();
        button.setText("Enter");
        TextField cardno = new TextField("enter your number");
        Label label=new Label("Enter your card number");
        VBox layout=new VBox(20);
        layout.getChildren().addAll(label,cardno,button);
        button.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
               int n= Integer.parseInt(cardno.getText());
               boolean y=v.validateNo(n);
               if(y==true)
                   
               {scene2 Menue = new scene2(stage);
               scene2 newscene = new scene2(stage);
               newscene.setX(x);  
                newscene.prepareScene();
                stage.setScene(newscene.getScene());
               }
               else
            	   
               {            AlertBox newscene = new AlertBox(stage);
               
               newscene.prepareScene();
               stage.setScene(newscene.getScene());}
            }
        });
       scene=new Scene(layout,300,200);
    }
       

    
    
}
