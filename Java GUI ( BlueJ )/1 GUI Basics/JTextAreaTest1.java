import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


import java.awt.*;

public class JTextAreaTest1
{
    public JTextAreaTest1(){

        JFrame jf = new JFrame("JPanel Test 1");
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.getContentPane().setBackground(Color.lightGray);
        jf.setLayout(new FlowLayout());
        
        
        // JTextArea
        JTextArea ta = new JTextArea();  // to display the text
        ta.setText("Hello World!\n\n "
            + "My name is Sachin Dahal. "
            + "I am from Shantinagar. "
            + "I study in Itahari International College. "
            + "My faculty is BSc. (Hons) Computing.\n\n "
            + "This is a random text.\n"
            + "This is a random text.\n"
            + "This is a random text.\n"
            + "This is a random text.\n"
            + "This is a random text.\n"
            + "This is a random text.\n\n"
            
            + "See you soon. Bye");
        
        ta.setLineWrap(true);  // sets the text in few lines
        ta.setBounds(50,50,300,300);
        ta.setWrapStyleWord(true);
        ta.setBackground(Color.lightGray);
        ta.setBorder(BorderFactory.createBevelBorder(1)); // giving border to text field
        ta.setForeground(Color.black);
        ta.setFont(new Font("Comic Sans",Font.ITALIC,15));
        ta.setEditable(false); // it cannot be edited by users but only by programmers
        
        // to add scroll bar
        JScrollPane sp = new JScrollPane(ta);
        sp.setPreferredSize(new Dimension(300,200));
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);  // for vertical scroll bar
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS); // for horizontal scroll bar
        
        
        
        
        jf.add(sp);
        jf.setVisible(true);
}

    public static void main(String[] args){
    
        new JTextAreaTest1();
    }
}

