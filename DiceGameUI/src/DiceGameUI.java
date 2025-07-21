import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DiceGameUI extends JFrame {

    private JLabel userDiceLabel, compDiceLabel;
    private JLabel messageLabel, totalScoreLabel;
    private JButton rollDiceButton;

    private int userPoints = 0;
    private int compPoints = 0;

    private Random diceGenerator;

    public DiceGameUI() {
        setTitle("🎲 Play Dice - Java GUI");
        setSize(420, 300);
        setLayout(new GridLayout(6, 1));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        diceGenerator = new Random();

        // GUI Components
        userDiceLabel = new JLabel("Your Dice: -", SwingConstants.CENTER);
        compDiceLabel = new JLabel("Computer Dice: -", SwingConstants.CENTER);

        messageLabel = new JLabel("Press 'Roll Dice' to begin", SwingConstants.CENTER);
        totalScoreLabel = new JLabel("Score → You: 0 | Computer: 0", SwingConstants.CENTER);

        rollDiceButton = new JButton("🎲 Roll Dice");
        rollDiceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playRound();
            }
        });

        // Add to Frame
        add(userDiceLabel);
        add(compDiceLabel);
        add(messageLabel);
        add(totalScoreLabel);
        add(rollDiceButton);
    }

    private void playRound() {
        int userRoll = diceGenerator.nextInt(6) + 1;
        int compRoll = diceGenerator.nextInt(6) + 1;

        userDiceLabel.setText("Your Dice: " + userRoll);
        compDiceLabel.setText("Computer Dice: " + compRoll);

        if (userRoll > compRoll) {
            messageLabel.setText("✅ You won this round!");
            userPoints++;
        } else if (compRoll > userRoll) {
            messageLabel.setText("❌ Computer won this round!");
            compPoints++;
        } else {
            messageLabel.setText("🤝 It's a Draw!");
        }

        totalScoreLabel.setText("Score → You: " + userPoints + " | Computer: " + compPoints);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DiceGameUI().setVisible(true);
        });
    }
}
