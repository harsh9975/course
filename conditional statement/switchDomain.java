import java.util.Scanner;

public class switchDomain{
  public static void main(String args[]){
    String domain;
    System.out.println("Enter Domain");
    Scanner sc = new Scanner(System.in);
    domain = sc.nextLine();
    String ext = domain.substring(domain.lastIndexOf('.')+1);

    switch(ext){
      case "com" : System.out.println("Commercial");
        break;
      case "gov" : System.out.println("Government");
        break;
      case "org" : System.out.println("Organisation");
        break;
      case "net" : System.out.println("Network");
        break;
      default: System.out.println("Invalid");
        break;
    }
  }
}