package Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileExample {
    public static void main(String[] args){
        String filename = "C:\\Users\\cantubakb\\Desktop\\cantuba.txt";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch(IOException e){
              System.out.println("An error occured.");  
              e.printStackTrace();
        }
    }
}
