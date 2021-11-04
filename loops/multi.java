import java.util.Scanner;

public class multi{
  public static void main(String args[]){
    int num,i;
    System.out.println("Enter no.");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

    for(i=1;i<=10;i++){
      System.out.println(num+" X "+i+" = "+num*i);
    }
  }
}