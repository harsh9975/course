import java.util.Scanner;

public class palindrome{
  public static void main(String args[]){
    int n, rev=0;

    System.out.println("Enter no.: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    int temp =n;

    while(n>0){
      rev = (rev*10) + (n%10);
      n=n/10;
    }

    System.out.println("reverse: "+rev);

    if(temp == rev){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}