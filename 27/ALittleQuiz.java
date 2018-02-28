import java.util.Scanner;

public class ALittleQuiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("Hey you! Are you ready for a quiz?");
		System.out.println("Even if you said no, too bad! ");
		System.out.println("(When you type in your answer, type in the number of your answer.)");
		System.out.println();
		
		System.out.println("Q1) What is Obama's Last Name?");
		System.out.println("		1) Obama			  ");
		System.out.println("		2) Trump			  ");
		System.out.println("		3) Hirabayashi        ");
		System.out.println();
		
		System.out.print("> ");
		int answer1 = input.nextInt();
		System.out.println();
		
		if (answer1 == 1) {
			System.out.println("NICE!!! That's correct!");	
			score += 1;
		}	else  {
			System.out.println("WRONG ANSWER! The correct answer is Obama.");
		}
		
		System.out.println();
		System.out.println("Q2) What is 3/3 + 2 + 24/4 - 6*3? (Hint: BEDMAS)");
		System.out.println("		1) 5.5					 ");
		System.out.println("		2) -9					 ");
		System.out.println("`		3) 12					 ");
		System.out.println();
		
		System.out.print("> ");
		int answer2 = input.nextInt();
		System.out.println();
		
		if (answer2 == 2) {
			System.out.println("Thats right! I'm impressed, I couldn't even figure the answer out until I asked my mommy.");
			score += 1;
		} else {
			System.out.println("You should work on your math a bit more because the answer is 3!");
		}
		
		System.out.println();
		System.out.println("Q3) What colour do you get when you mix red and green?");
		System.out.println("		1) yellow 				 ");
		System.out.println("		2) green				 ");
		System.out.println("		3) blood orange		     ");											
		System.out.println();
		
		System.out.print("> ");
		int answer3 = input.nextInt();
		System.out.println();
		
		if (answer3 == 1) {
			System.out.println("Well done! You sure know your colours.");
			score += 1;
		} else {
			System.out.println("Sorry, but you got it wrong. Red and Green mix to make yellow.");
		}
		
		System.out.println();
		System.out.println("Good Job! Overall you got " + score + " out of 3 correct.");
		System.out.println("Thank you very much for playing!");
	}
}

