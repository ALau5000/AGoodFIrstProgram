import java.util.Scanner;

public class AgeInFiveYears {

  public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Hey! What's your name? ");
		String name = input.next();
		
		System.out.println();

		System.out.print("Hi " + name + ", how old are you now? ");
		int age = input.nextInt();

		System.out.println();

		System.out.println("Do you know that five years from now, you will be " + (age + 5) + " years old?");
		System.out.println("And five years ago you were " + (age - 5) + "! Wow that's pretty cool!");

		System.out.println("And 1726 years from now, you will be " + (age + 1726) + "!!! Only if you can live that long...");

	}
}
		
