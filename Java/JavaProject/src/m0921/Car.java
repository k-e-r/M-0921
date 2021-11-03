package m0921;

public class Car {
  private String doors;
  private String engine;
  private String driver;
  private int speed;

  // constructor
  public Car() {
    doors = "closed";
    driver = "seated";
    engine = "on";
    speed = 5;
  }

  // parametertized constructor
  public Car(String doors, String driver, String engine, int speed) {
    this.doors = doors;
    this.driver = driver;
    this.engine = engine;
    this.speed = speed;
  }

  public String getDoors() {
    return doors;
  }

  // public void setDoors(String doors) {
  // this.doors = doors;
  // }

  public String getDriver() {
    return driver;
  }

  // public void setDriver(String driver) {
  // this.driver = driver;
  // }

  public String getEngine() {
    return engine;
  }

  // public void setEngine(String engine) {
  // this.engine = engine;
  // }

  public int getSpeed() {
    return speed;
  }

  // public void setSpeed(int speed) {
  // this.speed = speed;
  // }

  public String run() {
    if (doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
      return "running";
    } else {
      return "not running";
    }
  }
}
