package parent;

public class Animal {
  private int height;
  private int weight;
  private String animalType;
  private String bloodType;

  public Animal() {
    this.height = 5;
    this.weight = 5;
    this.animalType = "animal";
    this.bloodType = "animal";
  }

  public Animal(int height, int weight, String animalType, String bloodType) {
    this.height = height;
    this.weight = weight;
    this.animalType = animalType;
    this.bloodType = bloodType;
  }

  public int getHeight() {
    return height;
  }

  public int getWeight() {
    return weight;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getBloodType() {
    return bloodType;
  }
}
