import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  Random r = new Random();
	  
	  int card1 = 2 + r.nextInt(11);
	  int card2 = 2 + r.nextInt(11);
	  int playerTotal = card1 + card2;
	  
	  int card3 = 2 + r.nextInt(11);
	  int card4 = 2 + r.nextInt(11);
	  int dealerTotal = card3 + card4;
	  
	  int total = 0;
	  int addCard = 0;
	  
	  
	  System.out.println("Welcome to my blackjack game!!!");
	  System.out.println("You get a " + card1 + " and a " + card2 + ".");
	  System.out.println("Your total is " + playerTotal + ".\n");
	  System.out.println("The dealer has a " + card3 + " showing, and a hidden card.");
	  System.out.println("His total is hidden as well.\n");
	  System.out.print("Would you like to 'hit' or 'stay'?");
	  String hitOrStay = input.next();
	  
	  while (playerTotal <= 21) {
  	  if (hitOrStay.equals("hit")) {
        addCard = 2 + r.nextInt(11);
  	    total = playerTotal + addCard;
  	    playerTotal = total;
  	    System.out.println("You drew a " + addCard + ".");
  	    System.out.println("Your total is " + playerTotal + ".");
  	  } else if (hitOrStay.equals("stay")) {
  	    System.out.println("*");
  	  } if (playerTotal > 21) {
  	    System.out.println("That means your total is higher than 21! YOU LOSE!");
  	  } else if (playerTotal <= 21) {
    	  System.out.print("\nWould you like to 'hit' or 'stay'?");
  	    hitOrStay = input.next();
  	  }
	  }
	}
}
