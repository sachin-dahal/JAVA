import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangeBgDeCen implements ActionListener
{
    JFrame jf;
    JButton red;
    JButton blue;
    JButton yellow;
    JButton green;

    public ChangeBgDeCen()
    {
        jf = new JFrame("Change Background Heading");
        jf.setSize(600,600);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);

        red = new JButton("Red");
        red.setBounds(100,50,90,30);
        red.addActionListener(this);

        blue = new JButton("Blue");
        blue.setBounds(200,50,90,30);
        blue.addActionListener(this);

        yellow = new JButton("Yellow");
        yellow.setBounds(300,50,90,30);
        yellow.addActionListener(this);

        green = new JButton("Green");
        green.setBounds(400,50,90,30);
        green.addActionListener(this);

        jf.add(red);
        jf.add(blue);
        jf.add(yellow);
        jf.add(green);
    }

    @Override
    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand() == "Red"){
            jf.getContentPane().setBackground(Color.red);
        }
        if(ae.getActionCommand() == "Blue"){
            jf.getContentPane().setBackground(Color.blue);
        }
        if(ae.getActionCommand() == "Yellow"){
            jf.getContentPane().setBackground(Color.yellow);
        }
        if(ae.getActionCommand() == "Green"){
            jf.getContentPane().setBackground(Color.green);
        }
    }

    public static void main(String[] args){
        new ChangeBgDeCen().jf.setVisible(true);
    }
}
