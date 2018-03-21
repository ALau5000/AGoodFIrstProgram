import java.util.Scanner;
import java.util.Random;
public class KeepGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int number = 1 + r.nextInt(10);
        
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        int guess = input.nextInt();
        
        while (guess != number) {
            System.out.println("That's incorrect. GUESS AGAIN!!!");
            System.out.print("Your guess: ");
            guess = input.nextInt();
        } 
        
        if (guess == number) {
            System.out.println("Nice! You got it!");
        }
    }
}
        
