import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.*;

public class JLabelTest2
{

    public JLabelTest2(){

        JFrame jf = new JFrame("JLabel Test 2");
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.getContentPane().setBackground(Color.yellow);

        // JLabel
        
        ImageIcon image = new ImageIcon("NikeSmall.jpg");
        JLabel jl = new JLabel("This is Nike logo.",image,JLabel.CENTER);
        
        // change font and size of the text
        jl.setFont(new Font("MV Boli",Font.BOLD,30));  // (font-family, font-variant, font-size)
        
        // label positioning
        jl.setVerticalAlignment(JLabel.CENTER);  // TOP, CENTER, BOTTOM
        jl.setHorizontalAlignment(JLabel.CENTER);  // LEFT, CENTER, RIGHT
        jl.setVerticalTextPosition(JLabel.TOP);  // TOP, CENTER, BOTTOM
        jl.setHorizontalTextPosition(JLabel.CENTER);  // LEFT, CENTER, RIGHT
        
        // change color of the text
        jl.setForeground(Color.blue);
        
        
        
        
        

        jf.add(jl);
        jf.setVisible(true);
    }
    
    public static void main(String[] args){
    
        new JLabelTest2();
    }
}