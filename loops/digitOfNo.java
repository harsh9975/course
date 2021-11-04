import java.util.Scanner;

public class digitOfNo{
  public static void main(String args[]){
    int n;
    System.out.println("Enter number: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    while(n>0){
      int r = n % 10;
      n = n / 10;
      
      System.out.println(r);
    }
  }
}