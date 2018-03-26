import java.util.Scanner;
import java.util.Random;

public class HiLo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int number = 1 + r.nextInt(100);
        int tries = 1;
        
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        System.out.print("First guess: ");
        int guess = input.nextInt();
        
        while (guess != number && tries < 7) { 
            if (guess < number) {
                System.out.println("Sorry you are too low.");
            } if (guess > number) {
                System.out.println("Sorry you are too high.");
            }
                
            tries += 1;
            
            System.out.print("Guess #" +    tries + ": ");
            guess = input.nextInt();
        }
     
        if (guess != number && tries == 7) {
            System.out.println("Sorry, you didn't guess it in 7 tries. YOU LOSE!");
        } else if (guess == number) {
            System.out.println("Nicely done, you got it in " + tries + " tries!");
        }   
    }
}
            
            
