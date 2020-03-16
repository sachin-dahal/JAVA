
import javax.swing.*;
import java.awt.*;

public class FirstRandomGui
{
    public FirstRandomGui(){
    
        gui();
    }
    
    
    public void gui(){
    
        JFrame f = new JFrame("First Java GUI");
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p = new JPanel();
        p.setBackground(Color.YELLOW);
        
        JButton b = new JButton("Button");
        
        JLabel l = new JLabel("This is Label.");
        
        p.add(b); // adding button in panel
        p.add(l); // adding label in panel
        
        f.add(p); // adding panel in frame
        
    }
    
    
    public static void main(String[] args){
    
        new FirstRandomGui();
    }
}
