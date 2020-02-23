
import javax.swing.*;
import java.awt.*;

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
    
        f = new JFrame("Java Practice");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        
        
        p = new JPanel();
        p.setBackground(Color.yellow);
        
        b = new JButton("Button");
        b.setBounds(50,100,80,30);
        
        l = new JLabel("This is label.");
        
        
        f.add(p);
        
        p.add(b);
        p.add(l);
        
    }
    
    
    public static void main(String[] args){
    
        new GuiPract();
    
    }
}
