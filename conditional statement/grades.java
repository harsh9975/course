import java.util.Scanner;

public class grades{
  public static void main(String args[]){
    int m1,m2,m3,total;
    System.out.println("Enter Grades m1 m2 m3");
    Scanner sc = new Scanner(System.in);
    m1= sc.nextInt();
    m2=  sc.nextInt();
    m3= sc.nextInt();

    total = m1+m2+m3;
    System.out.println("Total marks: "+total);

    float per = (total*100)/300;
    System.out.println("Percentage: "+per);

    float avg = (float)(total)/3;

    if(avg >= 70){
      System.out.println("You got Grade A!");
    }

    else if(avg >= 60 && avg < 70){
      System.out.println("You got Grade B!");
    }

    else if(avg >= 50 && avg < 60){
      System.out.println("You got Grade C!");
    }

    else if(avg >= 40 && avg < 50){
      System.out.println("You got Grade D!");
    }

    else {
      System.out.println("You got Grade F!");
    }
  }
}