package Module12.Hard1;

import java.io.IOException;
import java.io.PrintWriter;

public class Hero {
    private String name;
    private PrintWriter printWriter = new PrintWriter("ResultTextHard1.txt");

    public Hero(String name) throws IOException {
        this.name = name;
    }

    public void go(String to) {
        System.out.println(name + " пошел в " + to);
        printWriter.println(name + " пошел в " + to);
    }

    public void eat(String meal) {
        System.out.println(name + " съел " + meal);
        printWriter.println(name + " съел " + meal);
    }

    public void talk(String somebody) {
        System.out.println(name + " разговаривал с " + somebody);
        printWriter.println(name + " разговаривал с " + somebody);
    }

    public void closePrintWriter() {
        printWriter.close();
    }
}
