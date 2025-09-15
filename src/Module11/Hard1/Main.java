package Module11.Hard1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел");
        String stringOfNumbers = scanner.nextLine();
        String[] numbers = stringOfNumbers.split(" ");
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (String number : numbers) {
            treeSet.add(Integer.parseInt(number));
        }
        System.out.println("Введите целые числа через пробел");
        String stringOfNumbers2 = scanner.nextLine();
        String[] numbers2 = stringOfNumbers2.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String number : numbers2) {
            if (treeSet.contains(Integer.parseInt(number))) {
                list.add(Integer.parseInt(number));
            }
            treeSet.add(Integer.parseInt(number));
        }
        for (int i : list) {
            treeSet.remove(i);
        }
        System.out.println(treeSet);
    }
}
