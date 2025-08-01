package Module7.Hard2;


public class Game {
    private Player player1 = new Player();
    private Player player2 = new Player();
    private int playerCounter1;
    private int playerCounter2;

    public void startGame() {                                 // игра до 3-х побед
        while (playerCounter1 < 3 && playerCounter2 < 3) {
            player1.moveOfPlayer();
            player2.moveOfPlayer();
            searchForWinner();
        }
        System.out.println("Игра закончена. Счет игроков: \n" + player1.getName() + " одержал " + playerCounter1 + " победы. \n" + player2.getName() + " одержал " + playerCounter2 + " победы.");
    }

    private void searchForWinner() {
        if (player1.getPlayerCards(player1.getCard()) == player2.getPlayerCards(player2.getCard())) {
            System.out.println("Ничья");
        }
        if (player1.getPlayerCards(player1.getCard()) == 0 & player2.getPlayerCards(player2.getCard()) == 1) {
            System.out.println("Камень бьет ножницы, " + player1.getName() + " выиграл!");
            playerCounter1 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 0 & player2.getPlayerCards(player2.getCard()) == 2) {
            System.out.println("Бумага накрывает камень, " + player2.getName() + " выиграл!");
            playerCounter2 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 0 & player2.getPlayerCards(player2.getCard()) == 3) {
            System.out.println("Камень падает в колодец, " + player2.getName() + " выиграл!");
            playerCounter2 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 1 & player2.getPlayerCards(player2.getCard()) == 0) {
            System.out.println("Камень бьет ножницы, " + player2.getName() + " выиграл!");
            playerCounter2 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 1 & player2.getPlayerCards(player2.getCard()) == 2) {
            System.out.println("Ножницы режут бумагу, " + player1.getName() + " выиграл!");
            playerCounter1 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 1 & player2.getPlayerCards(player2.getCard()) == 3) {
            System.out.println("Ножницы падают в колодец, " + player2.getName() + " выиграл!");
            playerCounter2 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 2 & player2.getPlayerCards(player2.getCard()) == 0) {
            System.out.println("Бумага накрывает камень " + player1.getName() + " выиграл!");
            playerCounter1 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 2 & player2.getPlayerCards(player2.getCard()) == 1) {
            System.out.println("Ножницы режут бумагу, " + player2.getName() + " выиграл!");
            playerCounter2 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 2 & player2.getPlayerCards(player2.getCard()) == 3) {
            System.out.println("Бумага накрывает колодец, " + player1.getName() + " выиграл!");
            playerCounter1 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 3 & player2.getPlayerCards(player2.getCard()) == 0) {
            System.out.println("Камень падает в колодец, " + player1.getName() + " выиграл!");
            playerCounter1 += 1;
        }
        if (player1.getPlayerCards(player1.getCard()) == 3 & player2.getPlayerCards(player2.getCard()) == 1) {
            System.out.println("Ножницы падают в колодец, " + player1.getName() + " выиграл!");
            playerCounter1 += 1;

        }
        if (player1.getPlayerCards(player1.getCard()) == 3 & player2.getPlayerCards(player2.getCard()) == 2) {
            System.out.println("Бумага накрывает колодец, " + player2.getName() + " выиграл!");
            playerCounter2 += 1;

        }
    }
}
