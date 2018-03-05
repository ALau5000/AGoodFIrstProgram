import java.util.Scanner;

public class AgeMessages3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello, what is your name?");
        String name = input.next();
        
        System.out.println("Hi " + name + ", how old are you?");
        int age = input.nextInt();
        
        System.out.println();
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println();
        
        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        } else if (age >= 16 && age <= 17) {
            System.out.println("You can drive but not vote, " + name + ".");
        } else if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car, " + name + ".");
        } else {
            System.out.println("You can do pretty much anything you want, " + name + ".");
        }
    }
}
