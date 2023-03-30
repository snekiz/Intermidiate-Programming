package Examples;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
        String filename = "C:\\Users\\cantubakb\\Desktop\\cantuba.txt";
        try{
            FileWriter writer = new FileWriter(filename); 
            writer.write("This is an example text file. \n");
            writer.write("This is a second line of text.");
            writer.close();
            System.out.println("File created: " + filename);
        } catch (IOException e){
              System.out.println("An error occured.");   
        }
            
        }
    }

