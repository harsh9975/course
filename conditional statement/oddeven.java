import java.util.Scanner;

public class oddeven{
  public static void main(String args[]){
    int number;
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();

    if(number%2==0){
      System.out.println("It is an even number");
    }

    else{
      System.out.println("It is an odd number");
    }
    
  }
}