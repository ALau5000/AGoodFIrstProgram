import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int tries = 0;
        
        int number = 1 + r.nextInt(10); 
        System.out.println("I have chosen a number from 1-10. Try to guess it.");
        System.out.print("Your guess: ");
        int guess = input.nextInt();
        
        while (guess != number) {
            tries ++;
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = input.nextInt();
            
            if (guess == number) {
                System.out.println("Wow correct! It only took you " + tries + " tries!");
            }
        }
    }
}
        
