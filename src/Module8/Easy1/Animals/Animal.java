package Module8.Easy1.Animals;

public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void walk();

    public abstract void say();

    public String getName() {
        return name;
    }
}
