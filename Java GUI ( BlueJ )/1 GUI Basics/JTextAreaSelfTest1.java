import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


import java.awt.*;

public class JTextAreaSelfTest1
{
    public JTextAreaSelfTest1(){
    
        JFrame jf = new JFrame("This is a heading.");
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBackground(Color.lightGray);
        jf.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        JTextArea ta = new JTextArea();
        ta.setText("Hello World!\n\n "
            + "My name is Sachin Dahal. "
            + "I am from Shantinagar. "
            + "I study in Itahari International College. "
            + "My faculty is BSc. (Hons) Computing.\n\n"
            + "This is a random text.\n"
            + "This is a random text.\n"
            + "This is a random text.\n"
            + "This is a random text.\n"
            + "This is a random text.\n"
            + "This is a random text.\n\n"
            
            + "See you soon. Bye");
        
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setBounds(100,100,400,250);
        ta.setEditable(false);
        ta.setFont(new Font("MV BOLI", Font.ITALIC,15));
        ta.setBorder(BorderFactory.createBevelBorder(0));
        ta.setForeground(Color.black);
        ta.setBackground(Color.lightGray);
        
        // for scroll bar
        JScrollPane sp = new JScrollPane(ta);
        sp.setPreferredSize(new Dimension(400,250));
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        
        jf.add(sp);
        jf.setVisible(true);
    }
    
    
    public static void main(String[] args){
    
        new JTextAreaSelfTest1();
    }
}
