package Module8.Easy1;

public class Penguin extends Animal {
    private String name = "пингвин";

    @Override
    public void walk() {
        System.out.println("Переваливается в лапки на лапку");
    }

    @Override
    public void say() {
        System.out.println("Звуки пингвина");
    }

    @Override
    public String getName() {
        return name;
    }
}
