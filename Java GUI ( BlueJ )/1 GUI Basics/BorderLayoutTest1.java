import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class BorderLayoutTest1
{
    
    public BorderLayoutTest1(){
    
        JFrame jf = new JFrame("Border Layout Heading");
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new BorderLayout());
        
        
        JPanel jp1 = new JPanel();
        //jp.setSize(100,100);   // size does nothing in border layout
        jp1.setBackground(Color.red);
        jp1.setPreferredSize(new Dimension(50,100));  // only height matters
        
        
        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.blue);
        jp2.setPreferredSize(new Dimension(100,50));  // only width matters
        
        JPanel jp3 = new JPanel();
        jp3.setBackground(Color.yellow);
        jp3.setPreferredSize(new Dimension(50,100));  // only height matters
        
        JPanel jp4 = new JPanel();
        jp4.setBackground(Color.green);
        jp4.setPreferredSize(new Dimension(100,50));  // only width matters
        
        JPanel jp5 = new JPanel();
        jp5.setBackground(Color.pink);
        jp5.setPreferredSize(new Dimension(100,50));  // it is auto resizable
        
        
        
        jf.add(jp1,BorderLayout.NORTH);
        jf.add(jp2,BorderLayout.EAST);
        jf.add(jp3,BorderLayout.SOUTH);
        jf.add(jp4,BorderLayout.WEST);
        jf.add(jp5,BorderLayout.CENTER);
        
        
        jf.setVisible(true);
    }
    
    
    public static void main(String[] args){
    
        new BorderLayoutTest1();
    }
}
