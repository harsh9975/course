import java.util.Scanner;

public class reverse{
  public static void main(String args[]){
    int n, rev=0;

    System.out.println("Enter no.: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    while(n>0){
      rev = (rev*10) + (n%10);
      n=n/10;
    }

    System.out.println("reverse: "+rev);
  }
}