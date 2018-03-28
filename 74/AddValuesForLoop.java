import java.util.Scanner;

public class AddValuesForLoop {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int total = 0;
	  int addNumbers = 0;
	  System.out.println("Type in a number and I will add all the numbers from 1 to that number");
	  System.out.print("Number: ");
	  int number = input.nextInt();
	  
	  for (int x = 1; x <= number; x += 1) {
	    System.out.print(x + " ");
	    addNumbers = x + total;
	    total = addNumbers;
	  }
	    System.out.println("\nThe sum is " + total + "!");
	}
}
