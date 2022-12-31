// import java.swing.*;

import javax.swing.JButton;
import javax.swing.*;


public class Gui {
     public static void main(String[] args){
          JFrame jframe=new JFrame("gui screen");
          //create jframe object
          jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          jframe.setSize(400,400);
          //set size of gui screen
     //   JButton firstButton=new JButton("first button");
     //   JButton seconfButton=new JButton("second button");
     //   jframe.getContentPane().add(firstButton, seconfButton);

          // jframe.getContentPane().add(firstButton);
          // jframe.getContentPane().add(seconfButton);
          

          jframe.setVisible(true);

     }
     
}
