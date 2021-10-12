package classes;

import parent.Animal;

public class Birds extends Animal {
  private String desc;
  private String feature;

  public Birds() {
    super();
    this.desc = "Animals with feathers";
    this.feature = "Can fly";
  }

  public Birds(String desc, String feature, int height, int weight, String animalType, String bloodType) {
    super(height, weight, animalType, bloodType);
    this.desc = desc;
    this.feature = feature;
  }

  public String getDesc() {
    return desc;
  }

  public String getFeature() {
    return feature;
  }
}
