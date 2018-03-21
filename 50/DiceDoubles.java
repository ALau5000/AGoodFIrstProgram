import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random r = new Random();
        
        int dice1 = 1 + r.nextInt(6);
        int dice2 = 1 + r.nextInt(6);
        
        int totalRoll = dice1 + dice2;
        
        while (dice1 != dice2) {
            System.out.println("HERE COME THE DICE ROLL!!!");
            System.out.println("DICE #1: " + dice1);
            System.out.println("DICE #2: " + dice2);
            System.out.println("THE TOTAL IS: " + totalRoll + "!!!");
            dice1 = 1 + r.nextInt(6);
			dice2 = 1 + r.nextInt(6);
        }
        
        System.out.println("HERE COME THE DICE ROLL!!!");
        System.out.println("DICE #1: " + dice1);
        System.out.println("DICE #2: " + dice2);
        System.out.println("THE TOTAL IS: " + totalRoll + "!!!");e
    }
}
