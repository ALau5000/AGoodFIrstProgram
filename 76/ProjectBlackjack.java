import java.util.Random;
import java.util.Scanner;

public class ProjectBlackjack {
	public static void main(String[] args) throws Exception {
	  Scanner input = new Scanner(System.in);
	  Random r = new Random();
	  
	  int card1 = 2 + r.nextInt(1000);
	  int card2 = 2 + r.nextInt(10);
	  int playerTotal = card1 + card2;
	  
	  int card3 = 2 + r.nextInt(10);
	  int card4 = 2 + r.nextInt(10);
	  int dealerTotal = card3 + card4;
	  
	  int total = 0;
	  int addCard = 0;
	  
	  System.out.println("Welcome to Bob's blackjack game!!!");
	  Thread.sleep(1000);
	  System.out.println("You get a " + card1 + " and a " + card2 + ".");
	  Thread.sleep(1000);
	  System.out.println("Your total is " + playerTotal + ".\n");
	  Thread.sleep(2000);
	  
	  if (playerTotal > 21) {
	    System.out.println("How unfortunate, your opening hand is over 21.");
	    Thread.sleep(2000);
	    System.out.println("Dealer Wins!");
	    System.exit(0);
	  }
	  
	  System.out.println("The dealer has a " + card3 + " showing, and a hidden card.");
	  System.out.println("His total is hidden as well.\n");
	  Thread.sleep(3000);
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
          break;
      } if (playerTotal > 21) {
          System.out.println("\nThat means your total is higher than 21! YOU LOSE!");
          System.exit(0);
      }
  	    System.out.print("\nWould you like to 'hit' or 'stay'?");
	      hitOrStay = input.next();
	  } 
	  
	  if (playerTotal <= 21 && hitOrStay.equals("hit")) {
    	    System.out.print("\nWould you like to 'hit' or 'stay'?");
  	      hitOrStay = input.next();
  	  }
  	  
    System.out.println("\nOkay, dealer's turn!");
    Thread.sleep(2000);
    System.out.println("His hidden card was a " + card4 + ".");
    System.out.println("His total was " + dealerTotal + ".");
    Thread.sleep(2000);
    
    if (dealerTotal >= 17) {
      Thread.sleep(2000);
      System.out.println("\nDealer decides to stay.");
      Thread.sleep(2000);
    }
    
    while (dealerTotal < 17) {
      Thread.sleep(2000);
      System.out.println("\nDealer decides to hit.");
      Thread.sleep(2000);
      addCard = 2 + r.nextInt(11);
      total = dealerTotal + addCard;
      dealerTotal = total;
      System.out.println("He draws a " + addCard + ".");
      System.out.println("His total is " + dealerTotal + ".");
      if (dealerTotal > 21) {
        Thread.sleep(2000);
        System.out.println("\nDealer's total is over 21! He loses and YOU WIN!");
        System.exit(0);
      } else if (dealerTotal >= 17) {
        Thread.sleep(2000);
        System.out.println("\nDealer decides to stay.");
        Thread.sleep(2000);
      }
    }
    
    System.out.println("\nDealer total is " + dealerTotal + ".");
    System.out.println("Your total is " + playerTotal + ".");
    Thread.sleep(2000);
    
    if (dealerTotal > playerTotal) {
      System.out.println("\nSorry, dealer's total is higher, you lose. :(");
    } else if (playerTotal > dealerTotal) {
      System.out.println("\nNice! Your total is higher! YOU WIN! :)");
    } else {
      System.out.println("\nLooks like it's a tie. No one wins!");
    }

	  
	}
}
