/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mayar abu zeid
 */
public class main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("ATM");
         AtmProject login=new AtmProject(primaryStage);
         login.prepareScene();
         primaryStage.setScene(login.getScene());
         primaryStage.show();    }
    public static void main(String[] args) {
        launch(args);
    }
}
