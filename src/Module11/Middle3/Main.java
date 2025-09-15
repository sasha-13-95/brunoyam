package Module11.Middle3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        Map<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            if (!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                hashMap.put(word, hashMap.get(word) + 1);
            }
        }
        for (String word : hashMap.keySet()) {                         // выводим для проверки
            System.out.println(word + "[" + hashMap.get(word) + "]");
        }
        int result = 0;
        for (Integer number : hashMap.values()) {
            result = Math.max(number, result);
        }
        String resultWord = null;
        for (var couple : hashMap.entrySet()) {
            if (result == couple.getValue()) {
                resultWord = couple.getKey();
            }
        }
        System.out.println("Самое часто встречающееся слово: " + resultWord + ". Оно встречается " + result + " раз(-а).");
    }
}
