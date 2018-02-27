import java.util.Scanner;

public class MoreUserInputData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please fill out the information below so I can use it for educational purposes");
        
		System.out.println("and use an underscore to represent a space."")
		
        System.out.print("First Name: ");
        String firstName = input.next();
        
        System.out.print("Last Name: ");
        String lastName = input.next();
        
        System.out.print("Grade: ");
        int grade = input.nextInt();

        System.out.print("Student ID: ");
        int studentID = input.nextInt();
        
        System.out.print("Login: ");
        String username = input.next();
        
        System.out.print("Average: ");
        double averageMark = input.nextDouble();
        
        System.out.println("REQUIRED: Fill out all the information below with no errors (VERY IMPORTANT!)");
        
        System.out.print("Credit Card Number: ");
        int creditCardNumber = input.nextInt();
        
        System.out.print("PIN for your Credit Card: ");
        int creditCardPin = input.nextInt();
        
        System.out.print("Favourite Video Game: ");
        String favouriteGame = input.next();
        
        System.out.print("Your Username: ");
        String usernameForGame = input.next();
        
        System.out.print("Your Password: ");
        String passwordForGame = input.next();
        
        System.out.println("Your Information: ");
        System.out.println("    Name: " + lastName + ", " + firstName);
        System.out.println("    Grade: " + grade);
        System.out.println("    ID: " + studentID);
        System.out.println("    Login: " + username);
        System.out.println("    Average: " + averageMark);
        System.out.println("    Credit Card Number: " + creditCardNumber);
        System.out.println("    Credit Card PIN: " + creditCardPin);
        System.out.println("    Video Game: " + favouriteGame);
        System.out.println("    Username: " + usernameForGame);
        System.out.println("    Password: " + passwordForGame);
        
        System.out.println("Thank you for your cooperation and understanding in this matter!");
        
        
    }
}
