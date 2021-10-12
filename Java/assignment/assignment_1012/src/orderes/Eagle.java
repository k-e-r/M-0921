package orderes;

import classes.Birds;

public class Eagle extends Birds {
  public Eagle() {
    super();
  }

  public Eagle(String desc, String feature, int height, int weight, String animalType, String bloodType) {
    super(desc, feature, height, weight, animalType, bloodType);
  }

  @Override
  public String toString() {
    return "Eagle [getdesc()=" + getDesc() + ", getFeature()=" + getFeature() + ", getHeight()=" + getHeight()
        + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType()
        + "]";
  }
}
