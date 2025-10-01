package Module13.Middle4;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        System.out.println("Введите свой номер телефона");
        try {
            phoneBook.addNumber(scanner.nextLine());
        } catch (IncorrectInputException e) {
            System.err.println(e.getMessage());
        }
    }
}
