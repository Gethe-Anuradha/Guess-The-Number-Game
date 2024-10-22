
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    
    // Function to start the game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int rounds = 3; // Number of rounds
        int maxAttempts = 5; // Limit the number of attempts per round
        int totalScore = 0; // Total score for the user
        
        // Loop through multiple rounds
        for (int round = 1; round <= rounds; round++) {
            System.out.println("\nRound " + round + " begins!");
            int numberToGuess = random.nextInt(100) + 1; // Generate random number between 1 and 100
            int attempts = 0; // Count attempts for each round
            boolean hasGuessedCorrectly = false; // To track if the user guessed correctly
            
            // Loop until the user runs out of attempts or guesses the number
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (between 1 and 100): ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    totalScore += (maxAttempts - attempts + 1) * 10; // Assign score based on attempts left
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }
            
            // If the user didn't guess correctly within the attempts
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
            }
        }
        
        // Display total score after all rounds
        System.out.println("\nGame Over! Your total score: " + totalScore);
        
        // Option to replay
        System.out.print("Do you want to play again? (yes/no): ");
        String replayChoice = scanner.next();
        if (replayChoice.equalsIgnoreCase("yes")) {
            playGame(); // Start again
        } else {
            System.out.println("Thank you for playing!");
        }
    }
    
    public static void main(String[] args) {
        // Start the game
        System.out.println("Welcome to the 'Guess the Number' Game!");
        playGame(); // Call the game function
    }
}

