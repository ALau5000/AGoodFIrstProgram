import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int x = 1 + r.nextInt(10);
        
        System.out.println("I'm thinking of a number from 1-10");
        System.out.println("Try to guess it.");
        System.out.print("Your guess: ");
        int number = input.nextInt();
        System.out.println();
        
        if (x == number) {
            System.out.println("That's right! My secret number is " + x + "!");
        } else { 
            System.out.println("WRONG! That's not my number!!! My number is " + x + "!!! " + ">:(");
        }
    }
}
        
        
        
