import java.util.Scanner;

public class factorial{
  public  static void main(String args[]){
    int n,i;
    System.out.println("Enter Number: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    long fact = 1;

    for(i=1;i<=n;i++){
      fact=fact*i;
    }

    System.out.println("Factorial: "+fact);

  }
}