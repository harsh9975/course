import java.util.Scanner;

public class armstrong{
  public static void main(String args[]){
    int n,r,sum=0;

    System.out.println("Enter number: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int temp = n;
    while(n>0){
      r = n%10;
      n=n/10;

      sum = sum + (r*r*r);
    }

    if(temp == sum){
      System.out.println("yes");
    }
    else{
      System.out.println("No");
    }
  }
}