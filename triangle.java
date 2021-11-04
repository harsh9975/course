import java.util.Scanner;

class triangle {
  public static void main(String[] args) {
    int a, b, c;
    System.out.println("Enter lenght of all three sides");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    float s = (a + b + c) / 2f;

    System.out.println("S :" + s);

    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    System.out.println("Area :" + area);

  }
}