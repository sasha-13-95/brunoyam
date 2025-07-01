package Module3;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько дней Вы отработали за месяц?");
        int workingDays = scan.nextInt();
        System.out.println("Введите размер вашей заработной платы за день");
        double salary = scan.nextDouble();
        System.out.println("Размер вашей зарплаты за отработанный месяц = " + (workingDays * salary));
    }
}
