
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/*FEATURES
-Play Again
-Shows the guesses left
-Give up button
-Number input only
-How to play the game button
*/

public class GuessingGame{
	//guessingGame properties
    
    JFrame f = new JFrame();
    JLabel lbl1 = new JLabel();
    JPanel pnl = new JPanel();
    JLabel lbl2 = new JLabel();
    JLabel lbl3 = new JLabel();
    JLabel BG = new JLabel();
    JTextField guess = new JTextField();
    JButton btn = new JButton();
    JLabel result = new JLabel();
    JButton playAgainButton = new JButton();
    JLabel guessesLeft = new JLabel();
    JButton giveup = new JButton();
    JButton hwtplay = new JButton();
    
    //HOW TO PLAY PROPERTIES
    JFrame f2 = new JFrame();
    JLabel BG2 = new JLabel();
    JLabel how1 = new JLabel();
    JLabel how2 = new JLabel();
    JLabel how3 = new JLabel();
    JLabel how4 = new JLabel();
    JLabel how5 = new JLabel();
    
    //LIVES
	int lives = 7;
  
	//RANDOMIZE
	Random rand = new Random();
    int randomNum = rand.nextInt(100) +1;
   
	
    public void guessingGame(){
       //JFrame Title
       f.setTitle("Darcy Guessing Game");
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Background Img
       f.setContentPane(new JLabel(new ImageIcon(getClass().getResource("/clouds.jpg"))));
       f.setLayout(new FlowLayout());
       f.add(BG);
       
       //Panel and its BORDERS
       Border border = new LineBorder(Color.RED, 5, true);
       pnl.setBorder(border);
       pnl.setBackground(Color.white);
       pnl.setBounds(60, 70, 500, 300);
       
       //Game name outside panel
       lbl1.setText("Darcy Guessing Game");
       lbl1.setFont(new Font("Rockwell Condensed", Font.BOLD, 30));
       lbl1.setForeground(Color.RED);
       lbl1.setBounds(180, 20, 300, 30);
       f.add(lbl1);
       
       //Game instruction inside panel
       lbl2.setText("Guess a number from 1 - 100");
       lbl2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
       lbl2.setBounds(120, 10, 500, 28);
       pnl.add(lbl2);
       
       //Guess here label 
       lbl3.setText("Guess here :");
       lbl3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
       lbl3.setBounds(80, 85, 150, 20);
       pnl.add(lbl3);
       
       //JTextField input guess
       guess.setText("");
       guess.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
       guess.setBounds(180, 75, 170, 50);
       Border border2  = new LineBorder(Color.RED, 3, true);
       guess.setBorder(border2);
       pnl.add(guess);
       
       
       //GUESSES LEFT
       guessesLeft.setText("Guesses left: " + lives);
       guessesLeft.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
       Border border3  = new LineBorder(Color.RED, 2, true);
       guessesLeft.setBounds(370, 55, 100, 30);
       guessesLeft.setBorder(border3);
       pnl.add(guessesLeft);
       
       //RESULT
       result.setText(" ");
       result.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
       result.setBounds(40, 230, 500, 50);
       pnl.add(result);
       
       //how to play button
       hwtplay.setText("How to play");
       hwtplay.setFont(new Font("Rockwell Condensed", Font.CENTER_BASELINE, 14));
       hwtplay.setForeground(Color.WHITE);
       hwtplay.setBackground(Color.RED);
       hwtplay.setBounds(5, 5, 105, 30);
       pnl.add(hwtplay);
       
       
       //GUESS BUTTON
       btn.setText("GUESS!");
       btn.setFont(new Font("Rockwell Condensed", Font.CENTER_BASELINE, 20));
       btn.setForeground(Color.WHITE);
       btn.setBackground(Color.RED);
       btn.setBounds(200, 150, 100, 60);
       pnl.add(btn);
       
       //GIVE UP button
       giveup.setText("GIVE UP ");
       giveup.setFont(new Font("Rockwell Condensed", Font.CENTER_BASELINE, 20));
       giveup.setForeground(Color.WHITE);
       giveup.setBackground(Color.RED);
       giveup.setBounds(50, 160, 130, 40);
       pnl.add(giveup);
       
       //play again button
       playAgainButton.setText("Play Again");
       playAgainButton.setFont(new Font("Rockwell Condensed", Font.CENTER_BASELINE, 20));
       playAgainButton.setForeground(Color.WHITE);
       playAgainButton.setBackground(Color.RED);
       playAgainButton.setBounds(320, 160, 140, 40);
       playAgainButton.setVisible(false);
       pnl.add(playAgainButton);
       
       //show the number into the console
       System.out.println(randomNum);
       
     
       //Number only input in the JTextField
       guess.addKeyListener(new KeyAdapter() {
           public void keyPressed(KeyEvent ke) {
              String value = guess.getText();
              int l = value.length();
              if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                 guess.setEditable(true);
                
              } else { 
                 guess.setEditable(false);
                 result.setText("* Enter only numeric digits >:(");
              }
           }
        });
       
       
       //CHECKING IF THE GUESS IS RIGHT AND LIVES
       btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){   
            int Numguess = Integer.parseInt(guess.getText());

                   //if its not right deduct lives
            	if(Numguess != randomNum) {
            		lives--;
            		guessesLeft.setText("Guesses left: " + lives);
            	}
                   //checker if its right and tips if its not
            	if(Numguess == randomNum) {
                 result.setText("Congratulations! You have guessed the right number :D");                   
                 btn.setEnabled(false);
                 playAgainButton.setVisible(true);
                 giveup.setEnabled(false);
            	}else if(Numguess > randomNum) {
            		result.setText("The number is less than " + Numguess +" You have " + lives +" guesses left!");
            	}else {
        		result.setText("The number is greater than " + Numguess +" You have " + lives +" guesses left!");
            	} 
            	
            	//checker for lives
            	if(lives == 0) {
            	  result.setText("You have ran out of guesses. The number was " + randomNum + " :P");   
            	  btn.setEnabled(false);
                  giveup.setEnabled(false);
            	  playAgainButton.setVisible(true);
                }
            	
        }    
        });
       
       
        //GIVE UP BUTTON ACTION
       giveup.addActionListener(new ActionListener(){
    	   public void actionPerformed(ActionEvent e) {
    		   result.setText("The number was " + randomNum +" better luck next time ;)");
    		   playAgainButton.setVisible(true);
    		   giveup.setEnabled(false);
    		   btn.setEnabled(false);
    	   }
       });
       
       
           //PLAY AGAIN ACTION RESETS ALL LIVES, NEW RANDOM NUM ETC.
       playAgainButton.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        randomNum = rand.nextInt(100) +1;
    	        lives = 7;
    	        guess.setText("");
    	        result.setText("");
    	        guessesLeft.setText("Guesses left: " + lives);
    	        btn.setEnabled(true);
    	        giveup.setEnabled(true);
    	        playAgainButton.setVisible(false);
    	        //show NEW random num into the console
    	        System.out.println(randomNum);
    	    }
    	});
       
         //HOW TO PLAY THE A POP UP WILL SHOW with the game instructions
       hwtplay.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e) {
               gameinfo();
               
           }
       });
       
       //Frame and Panel SETTINGS
       pnl.setLayout(null);
       f.setSize(650, 500);
       f.add(pnl);
       f.setLocationRelativeTo(null);
       f.setLayout(null);
       f.setVisible(true);
      
   
    }
    
    public void gameinfo(){
    	
     f2.setTitle("How to play");
     f2.getContentPane().setBackground(Color.BLACK);


     how1.setText("ONE random number from 1-100 was generated.");
     how1.setFont(new Font("Rockwell Condensed", Font.CENTER_BASELINE, 15));
     how1.setForeground(Color.WHITE);
     how1.setBounds(50, 15, 300, 15);
     
     how2.setText("You are given 7 tries to guess it.");
     how2.setFont(new Font("Rockwell Condensed", Font.CENTER_BASELINE, 15));
     how2.setForeground(Color.WHITE);
     how2.setBounds(90, 55, 300, 15);

     how3.setText("If you guessed the right number, you win.");
     how3.setFont(new Font("Rockwell Condensed", Font.CENTER_BASELINE, 15));
     how3.setForeground(Color.WHITE);
     how3.setBounds(60, 95, 300, 15);
     
     how4.setText("If not, then you lose :p");
     how4.setFont(new Font("Rockwell Condensed", Font.CENTER_BASELINE, 15));
     how4.setForeground(Color.WHITE);
     how4.setBounds(120, 135, 300, 15);
     
     how5.setText("GOODLUCK! <3");
     how5.setFont(new Font("Rockwell Condensed", Font.CENTER_BASELINE, 20));
     how5.setForeground(Color.WHITE);
     how5.setBounds(140, 190, 150, 20);


     f2.add(how1);
     f2.add(how2);
     f2.add(how3);
     f2.add(how4);
     f2.add(how5);
     

       f2.setSize(400, 300);
       f2.setLayout(null);
       f2.setLocationRelativeTo(null);
       f2.setVisible(true);                               
    }

    public static void main(String[] args) {
        GuessingGame g = new GuessingGame();
       g.guessingGame();
       
    }

   
}
