package Module8.Easy1;

public class Giraffe extends Animal {
    private String name = "жираф";

    @Override
    public void walk() {
        System.out.println("Ходит большими шагами");
    }

    @Override
    public void say() {
        System.out.println("Издает звуки по-жирафски");
    }

    @Override
    public String getName() {
        return name;
    }
}
