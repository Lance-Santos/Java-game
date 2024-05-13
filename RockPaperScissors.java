import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = { "Rock", "Paper", "Scissors" };
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String playerChoice;
        String computerChoice;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter Rock, Paper, or Scissors:");
            playerChoice = input.next();
            computerChoice = choices[rand.nextInt(choices.length)];

            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                    (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) ||
                    (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Do you want to play again? (Yes/No)");
            String playAgainAnswer = input.next();
            if (playAgainAnswer.equalsIgnoreCase("No")) {
                playAgain = false;
            }
        }
    }
}
