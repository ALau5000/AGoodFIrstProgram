import java.util.Scanner;

public class CollatzSequence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int times = 0;
    int maxNumber = 0;
    
    System.out.println("Type in any number and it will become 1 through the process of Collatz Sequence.");
    System.out.print("Number: ");
    int number = input.nextInt();
    maxNumber = number;
    
    System.out.print(number + "\t");
    while (number != 1) {
      times += 1;
      if (number % 2 == 0) {
        number = number/2;
        if (number > maxNumber) {
          maxNumber = number;
        }
      } else {
        number = number * 3 + 1;
        if (number > maxNumber) {
          maxNumber = number;
        }
      }
      System.out.print(number + "\t");
    }
    
    System.out.println("\nTerminated after " + times + " steps." + " The largest value was " + maxNumber + ".");
  }
}
