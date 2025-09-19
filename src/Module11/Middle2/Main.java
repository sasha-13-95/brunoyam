package Module11.Middle2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequenceOfNumbers = scanner.nextLine();
        String[] numbers = sequenceOfNumbers.split(" ");
        Set<Integer> hashSet = new HashSet<>();
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            hashSet.add(num);
        }
        System.out.println(hashSet.size());
    }
}
