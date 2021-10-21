import java.util.Scanner;

public class cuboid{
  public static void main(String args[]){
    int l,b,h;
    System.out.println("Enter length, breadth and height");

    Scanner sc = new Scanner(System.in);
    l = sc.nextInt();
    b = sc.nextInt();
    h = sc.nextInt();

    int front = l*h;
    System.out.println("Front/back area: "+front);

    int right = b*h;
    System.out.println("Right/Left area: "+right);

    int bottom = l*b;
    System.out.println("bottom/top area: "+bottom);

    int area = l*b*h;
    System.out.println("Area: "+area);

    int parameter = 2*(l+b);
    System.out.println("Parameter: "+parameter);

  }
}