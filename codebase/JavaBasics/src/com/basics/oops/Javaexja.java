package com.basics.oops;
import javax.swing.*;

public class Javaexja {
	
	
        public static void main(String[] args) 
        {
            //Create and set up the window.
            JFrame frame = new JFrame("HelloWorldSwing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Hello Athmeeya");
            frame.add(label);

            //Display the window.
            frame.pack();
            frame.setVisible(true);
        
    }
    class Dummy {
        // just to have another thing to pack in the jar
    }

}
