package Projects;

import javax.swing.*;
import java.awt.*;

public class DigitalClock {
    public static void main(String[] args) {

        //digital clock
        new myFrame();
        

    }
    public static class myFrame extends JFrame{

        myFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Digital Watch");
            this.setLayout(new FlowLayout());
            this.setSize(300, 250);
            this.setVisible(true);
        }

    }
}