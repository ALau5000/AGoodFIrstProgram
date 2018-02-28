import java.util.Scanner;

public class HowOldAreYou {

    public static void main(String[] main) {
    
        Scanner input = new Scanner(System.in);

        
        System.out.println("Hi there, what's your name? ");
        String name = input.next();
        
        System.out.println("Ok, " + name + ", how old are you?");
        int age = input.nextInt();
        
        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        }
        
        if (age < 18) {
            System.out.println("You can't vote, " + name + ".");
        }
        
        if (age < 25) {
            System.out.println("You can't rent a car, " + name + ".");
        }
        
        if (age >= 25) {
            System.out.println("You can do anything that's legal, " + name + ".");
        }
    }
}
