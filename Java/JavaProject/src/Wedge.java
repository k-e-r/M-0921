import java.util.*;

public class Wedge {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the int data");
    int inData = scan.nextInt();

    for (int i = 0; i < inData; i++) {
      for (int j = inData - i; j > 0; j--) {
        System.out.print("@");
      }
      System.out.println();
    }
    scan.close();
  }
}
