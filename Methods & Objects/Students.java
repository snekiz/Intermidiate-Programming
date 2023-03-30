
package OOP_LAB_ACTIVITIES;
import java.util.Scanner;
public class Students {
        String studentNum;
        String studentName;
        String course;
        String year;
     void getStudentDetails(){
     Scanner sc = new Scanner(System.in);   
       
      System.out.println("STUDENT DETAILS");
      System.out.print("Student Name: ");
      studentName = sc.nextLine();
      System.out.print("Student Number: ");
      studentNum= sc.nextLine();
      System.out.print("Course: ");
      course = sc.nextLine();
      System.out.print("Year: ");
      year = sc.nextLine();
      
     }   
    
      void showStudentDeatails(){
        System.out.println("\nStudent Number: " + year);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Course: " + course);
        System.out.println("Student Year: " + year);
    }
      
      public static void main(String[] args){
         Students s = new Students();
         s.getStudentDetails();
         s.showStudentDeatails();
    }
}   

