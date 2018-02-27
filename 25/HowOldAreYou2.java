import java.util.Scanner;

public class HowOldAreYou2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hello, what's your name? ");
        String name = input.next();
        
        System.out.print("Hi, " + name + ", how old are you?");
        int age = input.nextInt();
        
        if  (age < 16) {
        System.out.println("You can't drive, " + name + ".");
        }
        
        else if (age == 16 || age == 17) {
        System.out.println("You can drive but you can't vote, " + name + ".");
        }
        
        else if (age >= 18 && age <= 24) {
        System.out.println("You can vote but you can't rent a car, " + name + ".");
        }
        
        else if (age >= 25) {
        System.out.println("You can do pretty much anything, " + name + ", except illegal things.");
        }
            
    }
}
