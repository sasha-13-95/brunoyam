package Module11.Middle2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequenceOfNumbers = scanner.nextLine();
        String[] numbers = sequenceOfNumbers.split(" ");
        Set<Integer> treeSet = new TreeSet<>();
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            treeSet.add(num);
        }
        System.out.println(treeSet.size());
    }
}
