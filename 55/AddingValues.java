import java.util.Scanner;

public class AddingValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNumber;
        
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        int number = input.nextInt();
        
        while (number != 0) {
            totalNumber = number;   
            System.out.println("The total so far is " + totalNumber + number );
            System.out.print("Number: ");
        }
    }
}
                
            
            
            
