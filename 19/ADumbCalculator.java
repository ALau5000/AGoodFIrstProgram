import java.util.Scanner;

public class ADumbCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Hey there, what's up?");
		System.out.println();
		
		System.out.print("Can you give me an integer? ");
		int firstNumber = input.nextInt();

		System.out.print("And a decimal? ");
		double secondNumber = input.nextDouble();

		System.out.print("And another integer? ");
		int thirdNumber = input.nextInt();
		System.out.println();

		System.out.println("Hmm... so your numbers combined would be... oh! I got it! It's " + (firstNumber + secondNumber + thirdNumber));

	}
} 

		
