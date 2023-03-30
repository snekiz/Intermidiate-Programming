
package Examples;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
        public static void main(String[] args){
        String filename = "C:\\Users\\cantubakb\\Desktop\\cantuba.txt";
        String textToAppend = "This is a new line of text to append. /n";
        
        try{
            FileWriter writer = new FileWriter(filename, true);
            writer.write(textToAppend);
            writer.close();
            System.out.println("Text to appended to file: " + filename);
        } catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
   }
}
