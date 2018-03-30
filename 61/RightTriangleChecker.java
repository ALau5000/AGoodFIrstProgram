import java.util.Scanner;

public class RightTriangleChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter three integers: ");
    System.out.print("Side 1: ");
    int sideA = input.nextInt();
    
    System.out.print("Side 2: ");
    int sideB = input.nextInt();
    while (sideB < sideA) {
      System.out.println(sideB + " is smaller than " + sideA + "." + " Try again.");
      System.out.print("Side 2: ");
      sideB = input.nextInt();
    }
    
    System.out.print("Side 3: ");
    int sideC = input.nextInt();
    while (sideC < sideB) {
      System.out.println(sideC + " is smaller than " + sideA + "." + " Try again.");
      System.out.print("Side 3: ");
      sideC = input.nextInt();
    }
    
    double squareA = Math.pow(sideA, 2);
    double squareB = Math.pow(sideB, 2);
    double squareC = Math.pow(sideC, 2);
    double squareAB = squareA + squareB;
    
    System.out.println("Your three sides are " + sideA + ", " + sideB + ", " + sideC + ".");
    if (squareAB != squareC) {
      System.out.println("NO! These sides do not make a triangle!!!");
    } else if (squareAB == squareC) {
      System.out.println("These three sides make a triangle! YAY!");
    }
  }
}
