package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Application {

    public static boolean gamerunning = true;
    public static int[] answers = new int[50];
    private static int indexnow = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        while(gamerunning == true)
        {
            int binput = SampleController.returnbutton();
            System.out.println(binput);
            if(binput != answers[indexnow])
            {
                gamerunning = false;
            }
        }

        SampleController.endgame(gamerunning);
    }



}
