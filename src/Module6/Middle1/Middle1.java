package Module6.Middle1;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        String operation;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите действие (+, или -, или *, или /): ");
            operation = scan.nextLine();
            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Вы ввели некорректное значение");
            }
        } while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/"));
        System.out.print("Введите первый аргумент: ");
        int firstNum = scan.nextInt();
        System.out.print("Введите второй аргумент: ");
        int secondNum = scan.nextInt();
        if (operation.equals("+")) {
            System.out.println("Результат: " + MathematicalOperations.addition(firstNum, secondNum));
        } else if (operation.equals("-")) {
            System.out.println("Результат: " + MathematicalOperations.subtraction(firstNum, secondNum));
        } else if (operation.equals("*")) {
            System.out.println("Результат: " + MathematicalOperations.multiplication(firstNum, secondNum));
        } else if (operation.equals("/")) {
            System.out.println("Результат: " + MathematicalOperations.division(firstNum, secondNum));
        }
    }
}

