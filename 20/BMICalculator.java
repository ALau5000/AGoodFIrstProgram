import java.util.Scanner;
import java.text.DecimalFormat;

public class BMICalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		DecimalFormat df = new DecimalFormat(".#####");

		System.out.println("Hello human, if you are here, it means that you want to know your BMI,");
		System.out.println("but first, I need you to answer some simple questions.");
		System.out.println();

		System.out.print("What is your height in metres? ");
		double height = input.nextDouble();
		System.out.println();

		System.out.print("What is your weight in kilograms? ");
		double weight = input.nextDouble();
		System.out.println();

		System.out.println("Calculating... Your BMI is " + df.format(weight / Math.pow(height, 2)) + "!");	

	}
}
