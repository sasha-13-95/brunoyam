package Module8.Easy1;

public class Main {
    public static void main(String[] args) {
        int numberOfAnimals = 4;
        Animal[] animals = new Animal[numberOfAnimals];
        animals[0] = new Lion();
        animals[1] = new Tiger();
        animals[2] = new Penguin();
        animals[3] = new Giraffe();
        for (Animal animal : animals) {
            animal.say();
            animal.walk();
        }
        System.out.print("В зоопарке обитают животные: ");
        for (Animal animal : animals) {
            System.out.print(animal.getName() + " ");
        }
    }
}
