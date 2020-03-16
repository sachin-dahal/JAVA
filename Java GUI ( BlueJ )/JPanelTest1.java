import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;  // to create border outline


import java.awt.*;

public class JPanelTest1
{

    public JPanelTest1(){

        JFrame jf = new JFrame("JPanel Test 1");
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.getContentPane().setBackground(Color.yellow);
        
        ImageIcon image = new ImageIcon("NikeSmall.jpg");
        
        
        JLabel jl = new JLabel("This is a label.",image, JLabel.CENTER);
        //jl.setBounds(100,50,300,50);
        jl.setFont(new Font("MV Boli",Font.BOLD,30));  // (font-family, font-variant, font-size)
        
        // label positioning
        jl.setVerticalAlignment(JLabel.CENTER);  // TOP, CENTER, BOTTOM
        jl.setHorizontalAlignment(JLabel.CENTER);  // LEFT, CENTER, RIGHT
        jl.setVerticalTextPosition(JLabel.TOP);  // TOP, CENTER, BOTTOM
        jl.setHorizontalTextPosition(JLabel.CENTER);  // LEFT, CENTER, RIGHT
        
        // JPanel
        JPanel jp = new JPanel();
        jp.setBounds(100,100,300,300);
        jp.setBackground(Color.red);
        jp.setBorder(BorderFactory.createLineBorder(Color.blue,10)); // border outline (BorderFactory.borderType(color,size));
        jp.setBorder(BorderFactory.createBevelBorder(0));  // for 3d effect ( 0 and 1 )
        jp.setLayout(new BorderLayout());
        
        jp.add(jl);
        
        
        //jf.add(jl);
        jf.add(jp);
        jf.setVisible(true);
    }
    
    public static void main(String[] args){
    
        new JPanelTest1();
    }
}
