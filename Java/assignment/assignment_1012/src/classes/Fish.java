package classes;

import parent.Animal;

public class Fish extends Animal {
  private String habitat;
  private String feature;

  public Fish() {
    super();
    this.habitat = "Live in water";
    this.feature = "Has gills";
  }

  public Fish(String habitat, String feature, int height, int weight, String animalType, String bloodType) {
    super(height, weight, animalType, bloodType);
    this.habitat = habitat;
    this.feature = feature;
  }

  public String getHabitat() {
    return habitat;
  }

  public String getFeature() {
    return feature;
  }
}
