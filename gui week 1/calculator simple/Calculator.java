import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
     JLabel l1, l2;
     JTextField t1, t2;
     JButton b1, b2, b3, b4;

     Calculator() {
          setDefaultCloseOperation(EXIT_ON_CLOSE); // it exits on close
          setLayout(null); // creates a border with no gaps between the components
          l1 = new JLabel("simple Calculator");
          l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
          l1.setBounds(100, 10, 300, 30); // creates a Jlabel with specified text
          t1 = new JTextField("enter a number");
          t1.setBounds(20, 20, 30, 40);
          add(l1);

          t1 = new JTextField(60);// creates a new empty textfield with the specified number of colums
          t2 = new JTextField(60);
          b1 = new JButton("Add");
          b2 = new JButton("Sub");//creates a button witha sub in it 
          b3 = new JButton("Mul");
          b4 = new JButton("Div");

          t1.setBounds(100, 60, 120, 30);
          t2.setBounds(100, 100, 120, 30);

          b1.setBounds(100, 140, 60, 30);
          b2.setBounds(160, 140, 60, 30);

          b3.setBounds(100, 180, 60, 30);
          b4.setBounds(160, 180, 60, 30);

          l2 = new JLabel();
          l2.setBounds(250, 80, 250, 30);

          add(t1);
          add(t2);
          add(b1);
          add(b2);
          add(b3);
          add(b4);
          add(l2);

          b1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent ae) {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    l2.setText("Sum of two number is "+(num1+num2));
               }

          });
          b2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent ae) {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    l2.setText("Diffrerence  of two number is "+(num1-num2));
               }

          });
          b3.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent ae) {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    l2.setText("Multiplication  of two number is "+(num1*num2));
               }

          });
          b4.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent ae) {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    l2.setText("Division  of two number is "+(num1/num2));
               }

          });

     }

}

class SimpleCalculator {
     public static void main(String[] args) {
          Calculator c = new Calculator();
          c.setBounds(400, 200, 500, 300);
          c.setVisible(true);
     }
}
