package Module8.Easy1.Animals;

public class Penguin extends Animal {

    public Penguin() {
        super("пингвин");
    }

    @Override
    public void walk() {
        System.out.println("Переваливается в лапки на лапку");
    }

    @Override
    public void say() {
        System.out.println("Звуки пингвина");
    }
}
