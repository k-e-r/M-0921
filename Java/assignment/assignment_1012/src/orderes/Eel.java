package orderes;

import classes.Fish;

public class Eel extends Fish {
  private String feature;

  public Eel() {
    super();
    feature = "Release electric charge";
  }

  public Eel(String habitat, String feature, int height, int weight, String animalType, String bloodType) {
    super(habitat, feature, height, weight, animalType, bloodType);
    this.feature = feature;
  }

  @Override
  public String getFeature() {
    return feature;
  }

  @Override
  public String toString() {
    return "Eel [getHabita()=" + getHabitat() + ", getFeature()=" + getFeature() + ", getHeight()=" + getHeight()
        + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType()
        + "]";
  }
}
