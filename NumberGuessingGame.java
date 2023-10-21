import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1; // Minimum number in the range
        int max = 100; // Maximum number in the range
        int target = random.nextInt(max - min + 1) + min; // Generate a random number between min and max
        
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between " + min + " and " + max + ". Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < min || guess > max) {
                System.out.println("Please enter a number within the valid range.");
            } else if (guess < target) {
                System.out.println("The number is higher. Try again.");
            } else if (guess > target) {
                System.out.println("The number is lower. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number (" + target + ") in " + attempts + " attempts.");
                hasGuessedCorrectly = true;
            }
        }

        scanner.close();
    }
}
