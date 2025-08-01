package Module7.Middle4;

import java.util.Scanner;

public class Player {
    private String name;
    private Frog frog;
    private int jumpCount;
    Scanner scan = new Scanner(System.in);

    public Player() {
        System.out.println("Введи свое имя");
        name = scan.nextLine();
        System.out.println("Добро пожаловать в игру, " + name);
        frog = new Frog();
    }

    public String getName() {
        return name;
    }

    public void moveOfPlayer() {
        System.out.print(name);
        frog.jump();
        jumpCount = frog.getJumpCount();
    }

    public int getJumpCount() {
        return jumpCount;
    }
}
