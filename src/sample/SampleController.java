package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

public class SampleController {
    public Label button1;
    public Label button2;
    public Label button3;
    public Label button4;
    @FXML
    private static Label test;
    private static int buttoninput;

    public static void endgame(boolean gamerunning) {
        if(gamerunning==true)
        {
            test.setText("You WON");
        }
        else
        {
            test.setText("You LOST");
        }
    }

    public static int returnbutton() {
        return buttoninput;
    }

    public void sayHelloWorld(ActionEvent actionEvent) {
        test.setText("Hello World");
    }

    public void setButton1()
    {
        buttoninput = 1;
        //System.out.println(buttoninput);
    }

    public void setButton2()
    {
        buttoninput = 2;
        //System.out.println(buttoninput);
    }

    public void setButton3()
    {
        buttoninput = 3;
        //System.out.println(buttoninput);
    }

    public void setButton4()
    {
        buttoninput = 4;
        //System.out.println(buttoninput);
    }

    public int sendToCheck()
    {
        return this.buttoninput;
    }

    //will change these later to be one thing with a parameter
}