import java.util.Scanner;
import java.util.Random;

public class HiLo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int number = 1 + r.nextInt(100);
        int tries = 0;
        
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        System.out.print("First guess: ");
        int guess = input.nextInt();
        
        while (guess != number) {
            tries ++;    
            if (guess < number) {
            System.out.println("Sorry you are too low.");
            System.out.print("Guess #" + (tries + 1) + ": ");
            guess = input.nextInt();
            } else if (guess > number) {
            System.out.println("Sorry you are too high.");
            System.out.print("Guess #" + (tries + 1) + ": ");
            guess = input.nextInt();
            } if (tries == 7) {
                System.out.println("Sorry, you didn't guess it in 7 tries. YOU LOSE!");
            } else {
            System.out.println("Nicely done, you got it!");
            }
        }
    }
}
            
            
