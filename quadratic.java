import java.lang.*;
import java.util.Scanner;

public class quadratic {
  public static void main(String[] args) {
    int a,b,c;
    double r1,r2;
    System.out.println("Enter value a b c");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    double temp = Math.sqrt((b*b)-(4*a*c));

    r1 = (-b + temp)/(2*a);
    r2 = ( -b - temp)/(2*a);

    System.out.println("R1: "+r1);
    System.out.println("R2: "+r2);
  }
}