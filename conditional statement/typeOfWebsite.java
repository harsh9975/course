import java.util.Scanner;

public class typeOfWebsite{
  public static void main(String args[]){
    String web;
    System.out.println("Enter website");
    Scanner sc = new Scanner(System.in);
    web = sc.nextLine();

    String hypertext = web.substring(0, web.indexOf(":"));
    if (hypertext.equals("http") || hypertext.equals("https")){
      System.out.println("Hypertext transfer protocol");
    }
    else if (hypertext.equals("ftp") || hypertext.equals("ftps")){
      System.out.println("File transfer protocol");
    }
    else{
      System.out.println("Invalid protocol");
    }

    String ext = web.substring(web.lastIndexOf(".")+1);
    if(ext.equals("com")){
      System.out.println("commercial website");
    }
    else if(ext.equals("org")){
      System.out.println("Organisation website");
    }
    else if(ext.equals("in")){
      System.out.println("India website");
    }
    else if(ext.equals("gov")){
      System.out.println("Government website");
    }
    else if(ext.equals("net")){
      System.out.println("Network website");
    }
    else{
      System.out.println("Invalid website");
    }
  }
}