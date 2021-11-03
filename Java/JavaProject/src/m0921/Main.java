package m0921;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("open", "seated", "on", 50);
    // car.setDoors("closed");
    // car.setDriver("seated");
    // car.setEngine("on");
    // car.setSpeed(0);

    // System.out.println(car.getSpeed());
    // System.out.println(car.run());
    System.out.println(car.getSpeed());
    System.out.println(car.getDoors());
    System.out.println(car.getDriver());
    System.out.println(car.getEngine());

    System.out.println(car.run());
  }
}
