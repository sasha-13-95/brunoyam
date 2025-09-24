package Module12.Middle4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("TextMiddle4.txt"));
        PrintWriter printWriter = new PrintWriter("ResultTextMiddle4.txt");
        while (bufferedReader.ready()) {
            String sentence = bufferedReader.readLine().replaceAll("[0-9]", "");
            printWriter.println(sentence);
        }
        bufferedReader.close();
        printWriter.close();
    }
}
