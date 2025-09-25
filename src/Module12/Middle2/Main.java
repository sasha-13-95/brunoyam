package Module12.Middle2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("IntNumbers.txt"));
        PrintWriter printWriter = new PrintWriter("StringNumbers.txt");
        List<Integer> numbersInt = new ArrayList<>();
        List<String> numbersString = new ArrayList<>();
        Converter.readFile(bufferedReader, numbersInt);
        Converter.replaceNumbersWithWords(numbersInt, numbersString);
        Converter.writeToFile(printWriter, numbersString);
        bufferedReader.close();
        printWriter.close();
    }
}
