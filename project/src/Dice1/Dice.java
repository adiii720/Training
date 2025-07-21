import java.util.Random;

// Dice class to simulate dice roll
public class Dice {
    private Random random;

    public Dice() {
        random = new Random();
    }

    // Generates a random number between 1 and 6
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
