import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;


public class JLabelTest1
{
    
    public JLabelTest1(){
    
        JFrame jf = new JFrame("JLabel Test 1");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setLayout(null);
        jf.setLocationRelativeTo(null); 
        
        
        // JLabel
        JLabel jl = new JLabel("My name is Sachin Dahal.",JLabel.CENTER);  // Text in a label  (text, position)
        //jl.setBounds(100,50,200,40);  // both location and siize (left, top, width, height)
        
        jl.setText("Hello World!"); // changes JLabel(string) to this text
        
        // change the font
        Font f = new Font("Verdana",Font.PLAIN,20);  // (font-family, font-variant, font-size)
        jl.setFont(f);
        
        
        jf.add(jl);
        jf.setVisible(true);
    }
    
    
    public static void main(String[] args){
    
        new JLabelTest1();
    }

}
