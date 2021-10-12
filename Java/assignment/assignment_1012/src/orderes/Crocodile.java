package orderes;

import classes.Reptile;

public class Crocodile extends Reptile {
  private String eggs;

  public Crocodile() {
    super();
    this.eggs = "Hard-shelled eggs";
  }

  public Crocodile(String skin, String bone, String eggs, int height, int weight, String animalType, String bloodType) {
    super(skin, bone, eggs, height, weight, animalType, bloodType);
    this.eggs = eggs;
  }

  @Override
  public String getEggs() {
    return eggs;
  }

  @Override
  public String toString() {
    return "Crocodile [getSkin()=" + getSkin() + ", getBone()=" + getBone() + ", getEggs()=" + getEggs()
        + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
        + ", getBloodType()=" + getBloodType() + "]";
  }
}
