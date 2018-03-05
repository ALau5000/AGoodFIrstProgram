import java.util.Scanner;

public class TwentyQuestions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String guess = "";
		
		System.out.println("I GOT TWO QUESTIONS FOR YOU!!!");
		System.out.println("Think of an object and I'll guess what it is.");
		System.out.println();
		
		System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
		System.out.print("> ");
		String type = input.next();
		System.out.println();
		
		System.out.println("Question 2) Is it bigger than a fat cat?");
		System.out.print("> ");	
		String size = input.next();
		System.out.println();
		
		if (type.equals("animal")) {
			if (size.equals("yes")) {
				guess = "unicorn";
			} else {
				guess = "hamster";
			}
		
		} else if (type.equals("vegetable")) {
			if (size.equals("yes")) {
				guess = "cabbage";
			} else {
				guess = "carrot";
			}
		} else if (type.equals("mineral")) {
			if (size.equals("yes")) {
				guess = "mountain";
			} else {
				guess = "diamond ring";
			}
		} 
			System.out.println("According to my calculations, I believe you are thinking of a " + guess + ".");
			System.out.println("You don't have to tell me I'm right. I already know.");
		
	}
}
