package Module12.Middle3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("GoodDay.txt"));
        PrintWriter printWriter = new PrintWriter("ResultGoodDay.txt");
        while (bufferedReader.ready()) {
            String[] words = bufferedReader.readLine().split(" ");
            int count = words.length;
            while (count > 0) {
                printWriter.print(words[count - 1] + " ");
                count -= 1;
            }
            printWriter.println();
        }
        bufferedReader.close();
        printWriter.close();
    }
}
