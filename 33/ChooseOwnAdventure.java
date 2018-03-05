import java.util.Scanner;

public class ChooseOwnAdventure {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String choice1 = "", punchTalk = "", hopOn = "", animalchoice = "", cowSpin = "", takeOrb = "", grabHand = "";
		
		System.out.println  ("HELLO AND WELCOME TO MY FUN AND EXCITING ADVENTURE!!!");
		System.out.println();
		
		System.out.println("Your parents finally kicked you out of the house because you were being too annoying.");
		System.out.println("They throw you out the front door and say good luck. As you walk away from the house, ");
		System.out.println("you see a floating cow in one direction and an old guy in another direction. Do you walk");
		System.out.println("towards the old 'guy' or the floating 'cow'.");
		System.out.print("> ");
		choice1 = input.next();
		System.out.println();
		
		if (choice1.equals("guy")) {
			System.out.println("As you walk towards the old guy, he stares at you weirdly. He then starts walking slowly");
			System.out.println("to you. Do you 'punch' him in self defence or do you 'talk' to him?");
			System.out.print("> ");
			punchTalk = input.next();
		} else if (choice1.equals("cow")) {
		    System.out.println("The cow sees you and tells you to hop on his back. He says he can take you anywhere you want");
		    System.out.println("to go. Do you hop on his back or not? ('yes' or 'no')");
		    System.out.print("> ");
		    hopOn = input.next();      
		}
		
		if (punchTalk.equals("punch")) {
			System.out.println(); 
		    System.out.println("You throw a powerful punch at him. The old guy instantly reacts by grabbing your arm and twisting");
		    System.out.println("He then throws you into the air, teleports above you and kicks you to the ground. As you are falling");
		    System.out.println("toward the ground, you see a hand reaching out to you. Do you grab it or not? ('yes' or 'no')");
		    System.out.print("> ");
		    grabHand = input.next();
		    
		} else if (punchTalk.equals("talk")) {
			System.out.println();
		    System.out.println("You say hi to him and he says hi back. He tells you a riddle and asks you to choose two different");
		    System.out.println("answers. Riddle: I am a horse, but I am also an elephant, who am I? The answers he gives you are:");
		    System.out.println("A 'horse' and an 'elephant'. Which do you choose.");
		    System.out.print("> ");
		    animalchoice = input.next();
		} 
		
		if (grabHand.equals("yes")) {
			System.out.println();
			System.out.println("You grab the hand and it pulls you into another dimension where cats and dogs are the rulers of the");
			System.out.println("universe. You are forced to work for them as well as all other humans who have been brought to this");
			System.out.println("dimension by the angel of darkness.");
		} else if (grabHand.equals("no")) {
			System.out.println();
			System.out.println("You decide not to grab the hand and accept your fate. As you are about to hit the ground, you awaken");
			System.out.println("your psychic powers and stop yourself from falling. A few years later, you find yourself king of the");
			System.out.println("world after invading every country and conquering them.");
		}
		
		if (animalchoice.equals("horse")) {
			System.out.println();
		    System.out.println("The old guy, in a flash, turns into a unicorn and starts flying away leaving a trail of gold coins.");
		    System.out.println("You collect the gold coins. You use the gold coins to buy yourself a house and gaming supplies.");
		    System.out.println("Then you spend the rest of your life playing video games and die alone.");
		} else if (animalchoice.equals("elephant")) {
			System.out.println();
		    System.out.println("The old guy transforms into an elephants and sits on you. You die. GG.");
		}
		
		if (hopOn.equals("yes")) {
			System.out.println();
		    System.out.println("After you hop on, the cow starts spinning rapidly. You are stuck in a tornado the cow is creating. Do");
		    System.out.println("you tell it to 'stop' spinning or tell it to spin even 'faster'?");
		    System.out.print("> ");
		    cowSpin = input.next();
		} else if (hopOn.equals("no")) {
			System.out.println();
		    System.out.println("The cow is upset and flies away. After it flies away, a shiny black orb appears. You think to yourself,");
		    System.out.println("I can sell this for a lot of money. Do you take it or not? ('yes' or 'no')");
		    System.out.print("> ");
		    takeOrb = input.next();
		}
		
		if (cowSpin.equals("stop")) {
			System.out.println();
			System.out.println("The cow suddenly stops spinning, and because of inertia, your body flies off the cow and straight into a");
			System.out.println("wall covered with barbed wire. Then the wall explodes, killing you.");
		} else if (cowSpin.equals("faster")) {
			System.out.println();
			System.out.println("The cow increases the velocity of his spin and accelerates. You and the cow spin so fast that you both warp");
			System.out.println("into candyland, a land filled with you know... candy. Then you both spent the rest of your lives happily ever after.");
		}
		
		if (takeOrb.equals("yes")) {
			System.out.println();
				System.out.println("You reach for the orb and pick it up. It starts to shine, and a few seconds later, you are no more.");
		    System.out.println("The orb exploded, and as you are about to die, you hear the cow laughing from afar.");
		} else if (takeOrb.equals("no")) {
			System.out.println();
		    System.out.println("You decide to leave it alone and let someone else take it. You continue to walk, searching for a place");
		    System.out.println("to stay. After 30 seconds, an explosion occurred where the orb was. You see body parts flying everywhere");
		    System.out.println("and realize that you have just been saved by your decision. How lucky you are. Then 3 years later, you win");
			System.out.println("the lottery and buy yourself a nice home and have a good life.");
		}
		    
	}
}
