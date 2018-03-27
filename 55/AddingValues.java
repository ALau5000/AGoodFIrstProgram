import java.util.Scanner;

public class AddingValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int addNumbers = 0;
        
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        int number = input.nextInt();
        
        while (number != 0) {
            addNumbers = number + total ;   
            total = addNumbers; 
            System.out.println("The total so far is " + total);
            System.out.print("Number: ");   
            number = input.nextInt();  
            
            if (number == 0) {
                System.out.println("Your total is " + total);
            }
        }
    }
}
                
            
            
            
