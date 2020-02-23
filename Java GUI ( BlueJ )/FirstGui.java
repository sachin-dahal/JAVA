
import javax.swing.*;
import java.awt.*;

public class FirstGui
{
    
    private JFrame f;
    private JPanel p;
    private JButton b;
    private JLabel l;
    
    
    public FirstGui(){
    
        gui();
    }
    
    
    public void gui(){
    
        f = new JFrame("First Java GUI");
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p = new JPanel();
        p.setBackground(Color.YELLOW);
        
        b = new JButton("Button");
        
        l = new JLabel("This is Label.");
        
        p.add(b); // adding button in panel
        p.add(l); // adding label in panel
        
        f.add(p); // adding panel in frame
        
    }
    
    
    public static void main(String[] args){
    
        new FirstGui();
    }
}
