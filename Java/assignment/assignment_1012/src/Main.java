import classes.*;
import orderes.*;

public class Main {
    public static void main(String[] args) {
        Reptile reptile = new Reptile();
        Crocodile crocodile = new Crocodile();
        System.out.println(reptile.getEggs());
        System.out.println(crocodile.ShowInfo());

        Fish fish = new Fish();
        Eel eel = new Eel();
        System.out.println(fish.getFeature());
        System.out.println(eel.ShowInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.ShowInfo());
    }
}
