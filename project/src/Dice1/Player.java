public class Player
{
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}