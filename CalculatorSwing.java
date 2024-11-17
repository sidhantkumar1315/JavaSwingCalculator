import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorSwing{
    public static void main(String[] args){

        //making calculator object
        Calc a = new Calc();
    }

    static class Calc extends JFrame {

        //initializing text fields and buttons for all the four operations
        JTextField t1, t2, t3;
        JButton b,c,d,e;

        //all the calculator algorithm is done inside the constructor
        public Calc() {

            t1 = new JTextField(10);
            t2 = new JTextField(10);

            //for addition
            b = new JButton("Add");

            //for subtraction
            c = new JButton("Substract");

            //for multiplication
            d = new JButton("Multiply");

            //for division
            e = new JButton("Divide");

            t3 =  new JTextField(10);

            add(t1);
            add(t2);
            add(b);add(c);add(d);add(e);
            add(t3);


            //for addition
            ActionListener act1 = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int value = a + b;
                    t3.setText("" + value);
                }
            };
            b.addActionListener(act1);

            //for subtraction
            ActionListener act2 = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int value = a - b;
                    t3.setText("" + value);
                }
            };
            c.addActionListener(act2);

            //for multiplication
            ActionListener act3 = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int value = a * b;
                    t3.setText("" + value);
                }
            };

            d.addActionListener(act3);

            //for division
            ActionListener act4 = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int value = a / b;
                    t3.setText("" + value);
                }
            };
            e.addActionListener(act4);


            //to make visuals visible
            setVisible(true);

            //size of the window
            setSize(800,600);
            setLayout(new GridLayout(3,1));

            //to close the window when pressed 'X'
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }
}
