import java.util.Scanner;

public class ChooseOwnAdventure {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("HELLO AND WELCOME TO MY FUN AND EXCITING ADVENTURE!!!");
		System.out.println();
		
		System.out.println("Your parents finally kicked you out of the house because you were being too annoying.");
		System.out.println("They give you $5 and a backpack and say good luck. As you walk away from the house, you");
		System.out.println("see a floating cow in one direction and an old guy in another direction. Do you walk towards");
		System.out.println("the "old guy" or the "floating cow"");
		System.out.println("> ");
		String choice1 = input.next();
		
		if (choice1.equals("old guy")) {
			System.out.println("As you walk towards the old guy, he stares at you weirdly. He then starts walking slowly");
			System.out.println("to you. Do you "punch him" in self defence or do you "talk" to him?");
			String punchTalk = input.next();
		} if (punchTalk.equals("punch him")) {
			System.out.println("You throw a powerful swing at the old guy. The old guy instantly reacts and grabs a hold of your arm.");
			System.out.println("He twists it, throws you in the air, teleports above you and kicks you to the ground. You die because");
			System.out.println("the kick was so powerful that you went tunnelling right through the ground to the core of the earth");
			System.out.println("and disintegrated.");
		} if (punchTalk.equals("talk")) {
			System.out.println("You greet him and he greets you back. ")
		} else if (choice1.equals(floating cow)) {
			System.out.println("The cow tells you to hop on his back. He says that he will take you anywhere you want. Do you");
			System.out.println("hop on his back or not? ("yes" or "no")");
			String hopOrNot = input.next();
		} if (hopOrNot.equals("yes")) {
			System.out.println("")
		}
	}
}
