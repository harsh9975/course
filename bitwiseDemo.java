public class bitwiseDemo {
  public static void main(String[] args) {
    int x = -0b1010;
    // int y = 0b0110;
    int z;

    z = ~x;

    System.out.println(String.format("%s", Integer.toBinaryString(x)));

    System.out.println(String.format("%32s", Integer.toBinaryString(z)));

    System.out.println(z);
  }
}