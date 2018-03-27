import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type in a number and I will count to that number starting from 0.");
        System.out.print("Count to: ");
        int number = input.nextInt();
        for (int count = 0; count <= number; count += 1) {
            System.out.print(count + " ");
        }
    }
}
