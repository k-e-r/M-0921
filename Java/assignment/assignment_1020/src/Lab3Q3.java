import java.util.ArrayList;
import java.util.List;

class Car {
  private String make;
  private String model;
  private int year;

  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }
}

public class Lab3Q3 {

  public static void main(String[] args) {
    Car prius = new Car("Toyota", "Regular", 2001);
    Car gt = new Car("Toyota", "Sports", 2012);
    Car nBox = new Car("Honda", "Light", 2011);

    ArrayList<Car> lists = new ArrayList<Car>();
    lists.add(prius);
    lists.add(gt);
    lists.add(nBox);

    for (int i = 0; i < lists.size() - 1; i++) {
      if (lists.get(i).getYear() > lists.get(i + 1).getYear()) {
        lists.add(i, lists.get(i + 1));
        lists.remove(i + 2);
      }
    }

    for (Car list : lists) {
      System.out.print(list.getMake() + " ");
      System.out.print(list.getModel() + " ");
      System.out.println(list.getYear());
    }
  }

}
