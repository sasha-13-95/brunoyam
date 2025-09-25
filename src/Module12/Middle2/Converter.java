package Module12.Middle2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Converter {
    final static List<String> UNITS = List.of("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять");
    final static List<String> TEENS = List.of("десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать");
    final static List<String> TENS = List.of("", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто");

    public static void readFile(BufferedReader bufferedReader, List<Integer> numbersInt) throws IOException {
        while (bufferedReader.ready()) {
            numbersInt.add(Integer.parseInt(bufferedReader.readLine()));
        }
    }

    public static void replaceNumbersWithWords(List<Integer> numbersInt, List<String> numbersString) {
        for (int i = 0; i < numbersInt.size(); i++) {
            if (numbersInt.get(i) < 10) {
                numbersString.add(UNITS.get(i));
            }
            if (numbersInt.get(i) > 9 & numbersInt.get(i) < 20) {
                numbersString.add(TEENS.get(i - 9));
            }
            if (numbersInt.get(i) > 19 & numbersInt.get(i) < 100) {
                if (numbersInt.get(i) % 10 == 0) {
                    numbersString.add(TENS.get(i / 10 + 1));
                }
                if (numbersInt.get(i) % 10 != 0) {
                    numbersString.add(TENS.get(i / 10) + " " + UNITS.get(i % 10));
                }
            }
            if (numbersInt.get(i) == 100) {
                numbersString.add("сто");
            }
        }
    }

    public static void writeToFile(PrintWriter printWriter, List<String> numbersString) {
        for (int i = 0; i < numbersString.size(); i++) {
            printWriter.println(numbersString.get(i));
        }
    }
}

