package Module12.Middle2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("IntNumbers.txt"));
        PrintWriter printWriter = new PrintWriter("StringNumbers.txt");
        Converter.readFile(bufferedReader);
        Converter.replaceNumbersWithWords();
        Converter.writeToFile(printWriter);
        bufferedReader.close();
        printWriter.close();
    }
}
