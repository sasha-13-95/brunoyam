package Module8.Easy1.Animals;

public class Lion extends Animal {
    public Lion() {
        super("лев");
    }

    @Override
    public void walk() {
        System.out.println("Ходит как царь зверей");
    }

    @Override
    public void say() {
        System.out.println("Рычит");
    }
}
