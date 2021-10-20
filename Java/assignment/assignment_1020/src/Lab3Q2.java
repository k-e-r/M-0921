import java.util.ArrayList;
import java.util.Random;

public class Lab3Q2 {

  public static void main(String[] args) {
    int listNum = 10;
    ArrayList<Integer> list1 = new ArrayList<Integer>();

    Random r = new Random();
    for (int i = 0; i < listNum; i++) {
      list1.add(r.nextInt(49) + 1);
    }
    System.out.println(list1);
    System.out.println("*****************");

    // pattern 1
    ArrayList<Integer> list2 = list1;
    System.out.println(list2);
    System.out.println("*****************");

    list1.set(list1.size() - 1, -5);
    System.out.println(list1);
    System.out.println(list2);
    System.out.println("*****************");

    // pattern 2
    // ArrayList<Integer> list2 = new ArrayList<Integer>();
    // for (int i = 0; i < list1.size(); i++) {
    // list2.add(list1.get(i));
    // }
    // list1.set(list1.size() - 1, -5);
    // System.out.println(list1);
    // System.out.println(list2);
  }

}