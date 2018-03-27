import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type some numbers and I will count for you.");
        System.out.print("Count from: ");
        int start = input.nextInt();
        System.out.print("Count to: ");
        int countTo = input.nextInt();
        System.out.print("Count by: ");
        int increase = input.nextInt();
        System.out.println();
        
        for (int number = start; number <= countTo; number += increase) {
            System.out.print(number + " ");
        }
    }
}
