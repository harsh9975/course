import java.util.Scanner;

public class switchDays{
  public static void main(String args[]){
    int day;
    System.out.println("Enter Day:");
    Scanner sc = new Scanner(System.in);
    day = sc.nextInt();

    switch(day){
      case 1 : System.out.println("Sun");
        break;
      case 2 : System.out.println("Mon");
        break;
      case 3 : System.out.println("Tue");
        break;
      case 4 : System.out.println("Wed");
        break;
      case 5 : System.out.println("Thur");
        break;
      case 6 : System.out.println("Fri");
        break;
      case 7 : System.out.println("Sat");
        break;
      default : System.out.println("Invalid");
        break;
    }
  }
}