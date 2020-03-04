import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.*;

public class FirstLoginPage
{
    
    public static void main(String[] args){
    
        JFrame f = new JFrame("Fill this form");
        f.setSize(400,400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setBackground(Color.red);
        Container c = f.getContentPane();
        c.setBackground(Color.green);
        
        JLabel l = new JLabel("Login Page");
        l.setBounds(100,30,100,40);
        JLabel u = new JLabel("Username:");
        u.setBounds(100,80,100,40);
        JLabel pw = new JLabel("Password:");
        pw.setBounds(100,120,100,40);
        
        JTextField tf = new JTextField();
        tf.setBackground(Color.yellow);
        tf.setBounds(180,85,100,30);
        
        JPasswordField pf = new JPasswordField();
        pf.setBackground(Color.yellow);
        pf.setBounds(180,125,100,30);
        
        JButton btn = new JButton("Login");
        btn.setBackground(Color.yellow);
        btn.setBounds(180,180,80,30);
        
        f.add(l);
        f.add(u);
        f.add(pw);
        f.add(tf);
        f.add(pf);
        f.add(btn);
        f.setVisible(true);
    
    }
}
