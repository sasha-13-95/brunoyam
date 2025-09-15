package Module11.Middle1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        Map<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            if (!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                hashMap.put(word, hashMap.get(word) + 1);
            }
        }
        for (String word : hashMap.keySet()) {
            System.out.println(word + "[" + hashMap.get(word) + "]");
        }
    }
}
