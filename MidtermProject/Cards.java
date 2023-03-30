import java.util.Random;
import java.util.Scanner;

public class Cards {    //0      //1        //2       //3
	String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
    String[] values = {"Ace","2","3","4","5","6","7","8","9",
                          "10", "Jack", "Queen", "King"}; 

     //Generate 4 random cards
	 public void Random() {
		 Random rand = new Random(); 
	        for(int i = 0; i<4; i++){
	        int rand1 = rand.nextInt(suits.length);
	        int rand2 = rand.nextInt(values.length);
	        String value = values[rand2];
	        String suit = suits[rand1];
	        System.out.println( value+" of "+suit );    
	     }
		 PlayAgain();
	 }
	 
	 //asks the user if they want to play again
	 public void PlayAgain() {
	  Scanner sc = new Scanner(System.in);	 
		 System.out.println("\nDo you want to play again? \n [1]YES \t [2]NO");      
         int ans = sc.nextInt();
       switch(ans){ 
           case 1:  
               Random();
               break;
           case 2:    
               System.out.println("Thank you for playing :)");
               break;
           default:    
               System.out.println("Input Error");
               break;
       }
	 }
	 
	 public static void main(String[] args) {
          Cards s = new Cards();
          s.Random();
	}
}
