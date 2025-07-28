package Module6.Middle1;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        String operation;
        boolean correctInput = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите действие (+, или -, или *, или /): ");
        operation = scan.nextLine();
        while (!correctInput) {
            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Вы ввели некорректное значение, попробуйте снова");
                operation = scan.nextLine();
            } else {
                correctInput = true;
            }
        }
        System.out.print("Введите первый аргумент: ");
        int firstNum = scan.nextInt();
        System.out.print("Введите второй аргумент: ");
        int secondNum = scan.nextInt();
        switch (operation) {
            case "+" -> System.out.println("Результат: " + MathematicalOperations.addition(firstNum, secondNum));
            case "-" -> System.out.println("Результат: " + MathematicalOperations.subtraction(firstNum, secondNum));
            case "*" -> System.out.println("Результат: " + MathematicalOperations.multiplication(firstNum, secondNum));
            case "/" -> System.out.println("Результат: " + MathematicalOperations.division(firstNum, secondNum));
        }
    }
}
