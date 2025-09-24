package Module12.Middle4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("TextMiddle4.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        PrintWriter printWriter = new PrintWriter("ResultTextMiddle4.txt");
        String sentence = bufferedReader.readLine().replaceAll("[0-9]", "");
        printWriter.print(sentence);
        bufferedReader.close();
        fileReader.close();
        printWriter.close();
    }
}
