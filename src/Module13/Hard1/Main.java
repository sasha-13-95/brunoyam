package Module13.Hard1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("TextHard1Module13.txt"))) {
            while (bufferedReader.ready()) {
                String myText = bufferedReader.readLine();
                System.out.println(myText);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
