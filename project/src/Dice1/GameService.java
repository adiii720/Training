import java.util.Scanner;

// GameService handles the rounds, scoring and final result
public class GameService {
    private Dice dice;
    private Player player;
    private Player computer;
    private Scanner scanner;

    public GameService() {
        dice = new Dice();
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("🎲 Welcome to Backend Dice Game!");

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        player = new Player(playerName);
        computer = new Player("Computer");

        System.out.print("Enter number of rounds: ");
        int rounds = scanner.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.println("\n--- Round " + i + " ---");

            System.out.println(player.getName() + ", press Enter to roll the dice...");
            scanner.nextLine(); // flush newline
            scanner.nextLine(); // wait for Enter

            int playerRoll = dice.roll();
            int computerRoll = dice.roll();

            System.out.println(player.getName() + " rolled: " + playerRoll);
            System.out.println("Computer rolled: " + computerRoll);

            if (playerRoll > computerRoll) {
                System.out.println("✅ " + player.getName() + " wins this round!");
                player.incrementScore();
            } else if (playerRoll < computerRoll) {
                System.out.println("❌ Computer wins this round!");
                computer.incrementScore();
            } else {
                System.out.println("🤝 It's a tie!");
            }
        }

        showResult();
    }

    private void showResult() {
        System.out.println("\n🎯 Final Scores:");
        System.out.println(player.getName() + ": " + player.getScore());
        System.out.println("Computer: " + computer.getScore());

        if (player.getScore() > computer.getScore()) {
            System.out.println("🏆 " + player.getName() + " wins the game!");
        } else if (player.getScore() < computer.getScore()) {
            System.out.println("😞 Computer wins the game!");
        } else {
            System.out.println("⚖️ It's a draw!");
        }
    }
}