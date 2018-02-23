import java.util.Scanner;

public class TheForgetfulMachine {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many dogs do you have? ");
        int numberOfDogs = input.nextInt();

	    System.out.println("How many siblings do you have? ");
	    int numberOfSiblings = input.nextInt();
        
        System.out.println("What is your favourite sport? ");
        String favouriteSport = input.next();

	    System.out.println("And your favourite sports team? ");
	    String favouriteSportsTeam = input.next();

    	System.out.println("Thanks for answering these questions. I've learned a lot about you! ");
        
    } 
}
