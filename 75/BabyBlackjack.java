import java.util.Random;

public class BabyBlackjack {
	public static void main(String[] args) {
	  Random r = new Random();
	  
	  int card1 = 1 + r.nextInt(10);
	  int card2 = 1 + r.nextInt(10);
	  int card3 = 1 + r.nextInt(10);
	  int card4 = 1 + r.nextInt(10);
	  int playerTotal = card1 + card2;
	  int dealerTotal = card3 + card4;
	  
	  System.out.println("Baby Blackjack!!!\n");
	  System.out.println("You drew " + card1 + " and " + card2 + "!");
	  System.out.println("Your total is " + (playerTotal) + "!\n");
	  System.out.println("The dealer has " + card3 + " and " + card4 + "!");
	  System.out.println("The Dealer's total is " + (dealerTotal) + "!\n");
	  
	  if (playerTotal > dealerTotal) {
	    System.out.println("YOU WIN! :D");
	  } else if (dealerTotal > playerTotal) {
	    System.out.println("YOU LOSE! :(");
	  } else {
	    System.out.println("YOU TIED!!! :/");
	  }
	}
}
