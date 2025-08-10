package Module8.Easy1;

public class Lion extends Animal {
    private String name = "лев";

    @Override
    public void walk() {
        System.out.println("Ходит как царь зверей");
    }

    @Override
    public void say() {
        System.out.println("Рычит");
    }

    @Override
    public String getName() {
        return name;
    }
}
