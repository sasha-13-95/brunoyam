package Module8.Easy1;

public class Tiger extends Animal {
    private String name = "тигр";

    @Override
    public void walk() {
        System.out.println("Бежит за добычей");
    }

    @Override
    public void say() {
        System.out.println("Тигриный рык");
    }

    @Override
    public String getName() {
        return name;
    }
}
