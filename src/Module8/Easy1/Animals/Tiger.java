package Module8.Easy1.Animals;

public class Tiger extends Animal {
    public Tiger() {
        super("тигр");
    }

    @Override
    public void walk() {
        System.out.println("Бежит за добычей");
    }

    @Override
    public void say() {
        System.out.println("Тигриный рык");
    }
}
