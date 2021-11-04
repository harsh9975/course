import java.util.Scanner;

public class countDigit{
  public static void main(String args[]){
    int n;
    int count =0;

    System.out.println("enter no.: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    while(n>0){
      n = n /10;
      count++; 
    }

    System.out.println("No. of digits: "+count);
  }
}