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
        
        if (guess != aceCard) {
            if (aceCard == 1) {
                System.out.println("\nHAHA! Eddie WINS!!! The card number was " + aceCard + ".\n");
                System.out.println("        AA ## ##");
                System.out.println("        AA ## ##");
                System.out.println("        1  2  3\n");
            } else if (aceCard == 2) {
                System.out.println("\nHAHA! Eddie WINS!!! The card number was " + aceCard + ".\n");
                System.out.println("        ## AA ##");
                System.out.println("        ## AA ##");
                System.out.println("        1  2  3\n");
            } else if (aceCard == 3) {
                System.out.println("\nHAHA! Eddie WINS!!! The card number was " + aceCard + ".\n");
                System.out.println("        ## ## AA");
                System.out.println("        ## ## AA");
                System.out.println("        1  2  3\n");
            }
        }
        
        if (guess == aceCard) {
            if (aceCard == 1) {
                System.out.println("\nNice job! You got it! Eddie hands over your winnings and cries in a corner.\n");
                System.out.println("        AA ## ##");
                System.out.println("        AA ## ##");
                System.out.println("        1  2  3\n");
            } else if (aceCard == 2) {
                System.out.println("\nNice job! You got it! Eddie hands over your winnings and cries in a corner.\n");
                System.out.println("        ## AA ##");
                System.out.println("        ## AA ##");
                System.out.println("        1  2  3\n");
            } else if (aceCard == 3) {
                System.out.println("\nNice job! You got it! Eddie hands over your winnings and cries in a corner.\n");
                System.out.println("        ## ## AA");
                System.out.println("        ## ## AA");
                System.out.println("        1  2  3\n");
            }
        }
    }
}
        
        
        
        
        
        
        
        
        
