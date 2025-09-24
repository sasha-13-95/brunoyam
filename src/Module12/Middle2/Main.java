package Module12.Middle2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int NUMBER_OF_DIGITS = 100;
        FileReader fileReader = new FileReader("IntNumbers.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        PrintWriter printWriter = new PrintWriter("StringNumbers.txt");
        int[] numbers = new int[NUMBER_OF_DIGITS];
        final String[] UNITS = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        final String[] TEENS = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        final String[] TENS = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        for (int i = 0; i < NUMBER_OF_DIGITS; i++) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
            if (numbers[i] < 10) {
                printWriter.println(UNITS[i]);
            }
            if (numbers[i] > 9 & numbers[i] < 20) {
                printWriter.println(TEENS[i - 9]);
            }
            if (numbers[i] > 19 & numbers[i] < 100) {
                if (numbers[i] % 10 == 0) {
                    printWriter.println(TENS[i / 10 + 1]);
                }
                if (numbers[i] % 10 != 0) {
                    printWriter.println(TENS[i / 10] + " " + UNITS[i % 10]);
                }
            }
            if (numbers[i] == 100) {
                printWriter.println("сто");
            }
        }
        bufferedReader.close();
        fileReader.close();
        printWriter.close();
    }
}
