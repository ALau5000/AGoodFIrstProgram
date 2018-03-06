import java.util.Scanner;
import java.text.DecimalFormat;

public class BMICategories {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".#####");
		String bmiCategory = "";

		System.out.println("Hello there, human. If you are here, it means you want to know your BMI");
		System.out.println("Just answer these questions and your BMI category shall be presented below:\n");
		System.out.print("What is your height in metres? ");
		double height = input.nextDouble();
		System.out.print("What is your weight in kilograms? ");
		double weight = input.nextDouble();
		System.out.println("\nCalculating...\n");
		
		double bmi = weight / Math.pow(height, 2);
		
		if (bmi < 15.0) {
			bmiCategory = "very severely underweight";
		} else if (bmi >= 15.0 && bmi <= 16.0) {
			bmiCategory = "severely underweight";
		} else if (bmi >= 16.1 && bmi <= 18.4) {
			bmiCategory = "underweight";
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			bmiCategory = "normal weight";
		} else if (bmi >= 25.0 && bmi <= 29.9) {
			bmiCategory = "overweight";
		} else if (bmi >= 30.0 && bmi <= 34.9) {
			bmiCategory = "moderately obese";
		} else if (bmi >= 35.0 && bmi <= 39.9) {
			bmiCategory = "severely obese";
		} else {
			bmiCategory = "very severely underweight";
		}
		
		System.out.println("Your height in m: " + height);
		System.out.println("Your weight in kg: " + weight + "\n");
		System.out.println("Your BMI is " + df.format(bmi) + ".");
		System.out.println("BMI Category: " + bmiCategory);
	
	}
}
