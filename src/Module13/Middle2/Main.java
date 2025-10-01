package Module13.Middle2;

public class Main {
    public static void main(String[] args) {
      /* try {
      for (;;) {                                   вариант для OutOfMemoryError
           Cat cat = new Cat();
       } catch (OutOfMemoryError e) {
      System.out.println("Память переполнена!");
       } */
        try {
            exponentiation(5);                   // вариант для StackOverflowError
        } catch (StackOverflowError e) {
            System.out.println("Стек переполнен!");
        }
    }

    public static int exponentiation(int a) {
        exponentiation(a);
        return a * a;
    }
}
