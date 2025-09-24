package Module12.Easy1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class PrintExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("result.txt");
        printWriter.print(LocalDateTime.now());
        printWriter.close();
    }
}
