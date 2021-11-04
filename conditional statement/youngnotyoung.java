import java.util.Scanner;

public class youngnotyoung{
  public static void main(String args[]){
    int age;
    System.out.println("Enter age");
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();
    if (age >= 14 && age <=55)
    {
      System.out.println("Young");
    }
    else{
      System.out.println("Not Young");
    }
  }
}