// HigherLower_cardgame.java
package higher.lower_cardgame;

import java.util.Scanner;

public class HigherLower_cardgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Game game = new Game(player);
        game.startGame();

        scanner.close();
    }
}
