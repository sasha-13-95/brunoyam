package Module13.Middle1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой логин");
        try {
            enterLogin(scanner.nextLine());
        } catch (LoginIsNullException | IlligallFormatException e) {
            System.out.println("Некорректно введены данные. " + e.getMessage());
        }
    }

    public static void enterLogin(String login) throws LoginIsNullException, IlligallFormatException {
        if (login.matches(".*[0-9].*")) {
            throw new IlligallFormatException("В логине содержаться цифры");
        }
        if (login.isEmpty()) {
            throw new LoginIsNullException("Вы не ввели свой логин");
        }
        System.out.println("Ваш логин: " + login);
    }
}
