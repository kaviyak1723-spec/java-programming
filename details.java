import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your name:");
    String name =sc.nextLine();
    System.out.print("Enter your age:");
    int age =sc.nextLine();
    System.out.print("Hello, " + name + "! You are " + age + " years old.");
    sc.close();
  }
}
    
