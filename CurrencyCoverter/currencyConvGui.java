
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class currencyConvGui
{

    JFrame jf;
    JLabel jlHeading,jlCountry,jlAmount,jlConvertedAmtLabel, jlConvertedAmt;
    JTextField tfAmount;
    JComboBox jcbCountry;
    JButton jbConvert;
    
    public currencyConvGui(){

        initializeFrame();
        initializeBody();
    }
    
    public void initializeFrame(){

        jf = new JFrame("Currency Converter");
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        
    }
    
    public void initializeBody(){

        // JLable fields for the frame

        jlHeading = new JLabel("Nepali Currency Converter");
        jlHeading.setBounds(80,40,250,30);
        Font f = new Font("",Font.PLAIN,20);
        jlHeading.setFont(f);
        jf.getContentPane().add(jlHeading);
        
        
        jlCountry = new JLabel("Country: ");
        jlCountry.setBounds(40,110,120,30);
        Font cf = new Font("Verdana",Font.PLAIN,15);
        jlCountry.setFont(cf);
        jf.getContentPane().add(jlCountry);
        
        jlAmount = new JLabel("Type Amount: ");
        jlAmount.setBounds(40,170,120,30);
        jlAmount.setFont(cf);
        jf.getContentPane().add(jlAmount);
        
        // to view the converted amount
        jlConvertedAmtLabel = new JLabel("Amount in NRS");
        jlConvertedAmtLabel.setBounds(100,270,150,30);
        Font caf = new Font("",Font.PLAIN,20);
        jlConvertedAmtLabel.setFont(caf);
        jf.getContentPane().add(jlConvertedAmtLabel);

        jlConvertedAmt = new JLabel("Amount");
        jlConvertedAmt.setBounds(140,307,150,22);
        Font af = new Font("",Font.PLAIN,20);
        jlConvertedAmt.setFont(af);
        jf.getContentPane().add(jlConvertedAmt);



        // adding combobox to select the coutries

        String[] countries = {"---------------","USA","Canada","UK","India","Australia","China"};
        jcbCountry = new JComboBox(countries);
        jcbCountry.setBounds(180,110,150,25);
        jf.getContentPane().add(jcbCountry);


        // adding text field to enter the userAmount
        tfAmount = new JTextField();
        tfAmount.setBounds(180,170,150,25);
        jf.getContentPane().add(tfAmount);


        // adding button

        jbConvert = new JButton("Convert");
        jbConvert.setBounds(210,210,120,30);
        jbConvert.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae){

                convertAmount();
            }

        });
        jf.getContentPane().add(jbConvert);

    }

    public void convertAmount(){

        int amount;

        if (jcbCountry.getSelectedItem().equals("---------------")) {

            JOptionPane.showMessageDialog(jf,"Choose a Country first","Invalid Attempt",0);
            
        }
        else if(tfAmount.getText().isEmpty()){ 

            JOptionPane.showMessageDialog(jf,"Enter an amount.","Invalid Attempt",0);
        }
         else{

            try{

                amount = Integer.parseInt(tfAmount.getText());
                calculationMet(amount);

            }
            catch(NumberFormatException nfe){

                JOptionPane.showMessageDialog(jf,"Amount must be a number.","Invalid Amount",0);
                tfAmount.setText(null);
            }
        }
    }
    
    public void calculationMet(int rupee){

        currencyConvMet cc = new currencyConvMet();
        
        
        
        if (jcbCountry.getSelectedItem().equals("USA")) {
            float nrs=cc.usa(rupee);
            jlConvertedAmt.setText(Float.toString(nrs));
            
        }
        else if (jcbCountry.getSelectedItem().equals("Canada")) {
            float nrs=cc.canada(rupee);
            jlConvertedAmt.setText(Float.toString(nrs));
            
        }
        else if (jcbCountry.getSelectedItem().equals("UK")) {
            float nrs=cc.uk(rupee);
            jlConvertedAmt.setText(Float.toString(nrs));
            
        }
        else if (jcbCountry.getSelectedItem().equals("India")) {
            float nrs=cc.india(rupee);
            jlConvertedAmt.setText(Float.toString(nrs));
            
        }
        else if (jcbCountry.getSelectedItem().equals("Australia")) {
            float nrs=cc.australia(rupee);
            jlConvertedAmt.setText(Float.toString(nrs));
            
        }
        else if (jcbCountry.getSelectedItem().equals("China")) {
            float nrs=cc.china(rupee);
            jlConvertedAmt.setText(Float.toString(nrs));
            
        }


    }

    public static void main(String[] args){

        new currencyConvGui().jf.setVisible(true);
    }
    
    
}
