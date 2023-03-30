package OOP_LAB_ACTIVITIES;

import java.util.Scanner;
public class Activity2 {
     public static void main (String[] args){
         Start();
       } 
     
     public static void Start(){
         Scanner sc = new Scanner(System.in);   
    System.out.println("[1]SQUARE");
    System.out.println("[2]RECTANGLE");
    System.out.println("[3]TRIANGLE");
    System.out.println("[0]EXIT");
    int choose = sc.nextInt();
    
    switch (choose){
        case 1:
        Square();     
        break;
        case 2:
        Rectangle();   
        break;
        case 3:
        Triangle();    
        break;
        case 0:
        break;
        default:
        System.out.println("Input ERROR");
         Start();
      }
     
     }
       public static void Square(){
     int side;      
    Scanner sc = new Scanner(System.in);
    System.out.println("\nAREA OF A SQAURE");
    System.out.println("Please input side: ");
    side = sc.nextInt();
    System.out.println("AREA = " + side*side);
    }
       
       public static void Rectangle(){
         int width, length;   
    Scanner sc = new Scanner(System.in);
    System.out.println("\nAREA OF A RECTANGLE");
    System.out.println("Please input witdh: ");
    width = sc.nextInt();
    System.out.println("Please input length: ");
    length = sc.nextInt();
    System.out.println("AREA = " + ((2*length)+(2*width)));  
       }
       
       public static void Triangle(){
        Scanner sc = new Scanner(System.in);
        int a, b ,c , h;

        System.out.println("\nAREA AND PERIMETER OF A TRIANGLE");
        System.out.println("Please input a: ");
        a = sc.nextInt();
        System.out.println("Please input b: ");
        b = sc.nextInt();
        System.out.println("Please input c: ");
        c = sc.nextInt();
        System.out.println("Please input h: ");
        h = sc.nextInt();
        System.out.println("AREA = " +((1/2) * b * h));
        System.out.println("PERIMETER = " + (a + b + c));
       }
}
