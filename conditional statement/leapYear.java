import java.util.*;

public class leapYear{
  public static void main(String args[]){
    
    int year;
    System.out.println("Enter Year: ");
    Scanner sc = new Scanner(System.in);
    year = sc.nextInt();

    if(year%4==0){
      if(year%100 == 0){
        if(year%400 == 0){
          System.out.println("Yes! Its a leap year");
        }
        else{
          System.out.println("Not a leap year");
        }
      }
      else{
      System.out.println("Yes! its a leap year");
      }
    }
    else{
      System.out.println("Not a leap year");
    }
  }
}