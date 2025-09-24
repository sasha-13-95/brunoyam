package Module12.Hard1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Hero hero = new Hero("Сергей");
        hero.go("парк");
        hero.eat("мороженное");
        hero.talk("другом Витей");
        hero.closePrintWriter();
    }
}
