import java.util.Scanner;

public class SpaceBoxing {
    
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            
            System.out.print("Hello, Julio, what is your current weight on earth? ");
            double weight = input.nextDouble();
            System.out.println();
			
            System.out.println("I have information for the following planets:");
            System.out.println("	1. Venus    2. Mars    3.Jupiter		 ");
			System.out.println("	4. Saturn   5. Uranus  6. Neptune		 ");
            System.out.println();
			
			System.out.print("Please type in the number of the planet. Which planet are you visiting? ");
			int planetNumber = input.nextInt();
			System.out.println();	
			
			if (planetNumber == 1) {
				System.out.println("Your weight would be " + weight * 0.78 + " pounds on that planet.");
			} else if (planetNumber == 2) {
				System.out.println("Your weight would be " + weight * 0.39 + " pounds on that planet.");
			} else if (planetNumber == 3) {
				System.out.println("Your weight would be " + weight * 2.65 + " pounds on that planet.");
			} else if (planetNumber == 4) {
				System.out.println("Your weight would be " + weight * 1.17 + " pounds on that planet.");
			} else if (planetNumber == 5) {
				System.out.println("Your weight would be " + weight * 1.05 + " pounds on that planet.");
			} else if (planetNumber == 6) {
				System.out.println("Your weight would be " + weight * 1.23 + " pounds on that planet.");
			}
	}
}
