import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Names {
    
    public static void Names(){
        Scanner sc = new Scanner(System.in);  
                          //Directory
      String filename = "C:\\Users\\pc\\Desktop\\file.txt";
        try{
            FileWriter writer = new FileWriter(filename, true);
            while(true){
              String names = sc.nextLine();
              if(names.equalsIgnoreCase("quit")){
                   writer.close();
                   break;
              }
              writer.write(names + "\n");
            }
            System.out.println("File succesfully created: " + filename);
        } catch(IOException e){
             System.out.println("An error occured.");  
        }
    }
    public static void main(String[] args){
       Names();
    }
}
