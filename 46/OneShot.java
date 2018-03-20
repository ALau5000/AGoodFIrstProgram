import java.util.Scanner;
import java.util.Random;

public class OneShot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int guess;
        
        int number = 1 + r.nextInt(100);
        
        System.out.println("I'm thinking of a number between 1-100. Try to guess it my dude!!!!!!!!!");
        System.out.print("> ");
        guess = input.nextInt();
        System.out.println();
        
        if (number < guess) {
            System.out.println("Sorry, your guess was too low. I was thinking of the number: " + number);
        } else if (number > guess) {
            System.out.println("Sorry, your guess was too high. I was thinking of the number: " + number);
        } else {
            System.out.println("That's it! THAT'S MY NUMBER!!!");
        }    
        
    }
}
