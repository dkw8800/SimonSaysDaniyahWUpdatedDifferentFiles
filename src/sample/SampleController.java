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

    public static boolean gamerunning = true;
    public static int[] answers = new int[50];
    private static int indexnow = 0;

    public void rungame() {
        for(int i = 0; i < answers.length;i++)
        {
            answers[i] = (int)Math.random()*4+1;
        }
        while (gamerunning == true)
        {
            int binput = SampleController.returnbutton();
            System.out.println(binput);
            if (binput != answers[indexnow]) {
                gamerunning = false;
            }
        }

        if(gamerunning==true)
        { test.setText("You WON"); }
        else
        { test.setText("You LOST"); }
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
        System.out.println(buttoninput);
        for(int i = 0; i < answers.length;i++)
        {
            answers[i] = (int)Math.floor(Math.random()*4+1);
            System.out.println(answers[i]);
        }

    }

    public void setButton2()
    {
        buttoninput = 2;
        System.out.println(buttoninput);
    }

    public void setButton3()
    {
        buttoninput = 3;
        System.out.println(buttoninput);
    }

    public void setButton4()
    {
        buttoninput = 4;
        System.out.println(buttoninput);
    }

    //will change these later to be one thing with a parameter
}