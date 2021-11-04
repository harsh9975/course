public class StringPractice{
  public static void main(String args[]){
    String str1 = "Java Program";
    
    String str2 = new String("JAVA");

    char c[]= {'H','e','l','l','o'};
    String str3 = new String(c);

    byte b[]= {65,66,67,68};
    String str4 = new String(b);

    String str5 = new String("netbeans");
    int len = str5.length();
    String str6 = str5.toUpperCase();

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
    System.out.println(len);
    System.out.println(str6);
  }
}