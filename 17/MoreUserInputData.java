public class MoreUserInputData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please fill out the information below so I can use it for educational purposes");
        
        System.out.println("First Name: ");
        String firstName = input.next();
        
        System.out.println("Last Name: ");
        String lastName = input.next();
        
        System.out.println("Grade: ");
        int grade = input.nextInt();
        
        System.out.println("Worst Mark This Year: ");
        double worstMark = input.nextDouble();
        
        System.out.println("That's a pretty good mark!");
        
        System.out.println("Library Card: ");
        int libraryCard = input.nextInt();
        
        System.out.println("REQUIRED: Fill out all the information below with no errors (VERY IMPORTANT!)");
        
        System.out.println("Credit Card Number: ");
        int creditCardNumber = input.nextInt();
        
        System.out.println("PIN for your Credit Card: ");
        int creditCardPin = input.nextInt();
        
        System.out.println("Favourite Video Game: ");
        String favouriteGame = input.next();
        
        System.out.println("Your Username: ");
        String usernameForGame = input.next();
        
        System.out.println("Your Password: ");
        String passwordForGame = input();
        
        
    }
}
        
        
