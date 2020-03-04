import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.*;

public class JFrameTest1
{
    public static void main(String[] args){
    
        JFrame jf = new JFrame("MY Heading");
        
        jf.setSize(500,500);  // size
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // close button
        
        //jf.setLocation(100,100);  // where frame should load in screen
        
        jf.setLocationRelativeTo(null);  // loads frame on center
        
        //jf.setResizable(false);  // cannot resize the frame
        
        ImageIcon icon = new ImageIcon("Nike.jpg");  // image for icon
        jf.setIconImage(icon.getImage());  // using that image as icon
        
        Container cp = jf.getContentPane();  // creating container to put color
        cp.setBackground(Color.red);  // giving background color
        
        jf.setVisible(true);  // visibility of the frame
    }
}
