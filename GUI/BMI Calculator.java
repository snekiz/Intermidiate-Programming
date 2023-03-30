
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class GUI {
  
    GUI(){
        JFrame f = new JFrame("BMI CALCULATOR SHEESH");
        f.getContentPane().setBackground(Color.cyan);
       
        JLabel lbl = new JLabel("Height (cm):");
        lbl.setBounds(20, 20, 100, 40);
        f.add(lbl); 
        
        JLabel lb2 = new JLabel("Weight (kg): ");
        lb2.setBounds(20, 60, 100, 40);
        f.add(lb2);
        
        JLabel lbResult = new JLabel("BMI Calculator in JAVA GUI");
        lbResult.setBounds(20, 90, 300, 40);
        f.add(lbResult);
        
        JLabel lbName = new JLabel("Kurt B. Cantuba INF223");
        lbName.setBounds(120, 180, 300, 40);
        f.add(lbName);
        
        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);
        f.add(txtHeight);
        
        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 60, 200, 40);
        f.add(txtWeight);
        
        JButton btn = new JButton("BMI Calculator in JAVA GUI(Calculate)");
        btn.setBounds(20, 130, 300, 40);
        
        
        
        btn.addActionListener(new ActionListener(){
           @Override
        public void actionPerformed(ActionEvent e){   
            
            double kgWeight = Double.parseDouble(txtWeight.getText());
            double cmHeight = Double.parseDouble(txtHeight.getText());
             
            double weight = kgWeight * 2.20462262;
            double height = cmHeight / 2.54;
            
            double bmi  = weight / Math.pow(height, 2) * 703;
            
            if(bmi < 18.5){
               lbResult.setText("underweight - BMI : " +bmi);   
            }else if (bmi < 25){   
               lbResult.setText("normal - BMI : " +bmi);   
            }else if (bmi < 30){
               lbResult.setText("overweight - BMI : " +bmi);   
            }else{
                lbResult.setText("obese - BMI : " +bmi);   
            }
        }    
        });
        f.add(btn); 
        
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        new GUI();
    }
    
}
