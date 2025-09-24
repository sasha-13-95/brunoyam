package Module12.Middle1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("MyText.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String sentence = bufferedReader.readLine();
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
            System.out.println(word + " - " + hashMap.get(word));
        }
        bufferedReader.close();
        fileReader.close();
    }
}
