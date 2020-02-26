
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Event.*;

public class GuiPract
{
    
    private JFrame f;
    private JPanel p;
    private JButton b;
    private JLabel l;
    
    public GuiPract(){
    
        gui();
    }
    
    public void gui(){
        
        // f.setLayout(null);
        f = new JFrame("Java Practice");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,500,500);
        // f.setResizable(false);
        
        
        // p = new JPanel();
        f.setBackground(Color.yellow);
        
        b = new JButton("Button");
        b.setBounds(100,300,80,30);
        
        l = new JLabel("This is label.");
        
        
        // f.add(p);
        
        f.add(b);
        f.add(l);
        
    }
    
    
    public static void main(String[] args){
    
        new GuiPract();
    
    }
}
