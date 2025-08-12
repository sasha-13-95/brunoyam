package Module8.Easy1.Animals;

public class Giraffe extends Animal {
    public Giraffe() {
        super("жираф");
    }

    @Override
    public void walk() {
        System.out.println("Ходит большими шагами");
    }

    @Override
    public void say() {
        System.out.println("Издает звуки по-жирафски");
    }
}
