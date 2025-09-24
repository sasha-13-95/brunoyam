package Module12.Middle3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("GoodDay.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        PrintWriter printWriter = new PrintWriter("ResultGoodDay.txt");
        String[] words = bufferedReader.readLine().split(" ");
        int count = words.length;
        while (count > 0) {
            printWriter.print(words[count - 1] + " ");
            count -= 1;
        }
        bufferedReader.close();
        fileReader.close();
        printWriter.close();
    }
}
