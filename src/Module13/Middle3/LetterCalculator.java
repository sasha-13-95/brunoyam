package Module13.Middle3;

public class LetterCalculator {
    public static int calculating(String text) {              //данный метод выбрасывает исключение NullPointerException,
        int counter = 0;                                      //если пользователь не ввел ничего
        for (char c : parsing(text)) {
            counter++;
        }
        return counter;
    }

    private static char[] parsing(String text) {
        char[] letters;
        if (text.isEmpty()) {
            letters = null;
        } else {
            letters = text.toCharArray();
        }
        return letters;
    }
}
