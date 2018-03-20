import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int guess;
        int aceCard = 1 + r.nextInt(3);
        
            
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.\n");
        System.out.println("Which one is the ACE?\n");
        System.out.println("        ## ## ##");
        System.out.println("        ## ## ##");
        System.out.println("        1  2  3\n");
        System.out.print("> ");
        guess = input.nextInt();
        
        if (aceCard == guess) {
            System.out.println("
