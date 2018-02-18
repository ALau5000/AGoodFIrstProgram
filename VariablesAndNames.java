public class VariablesAndNames {
    
    public static void main(String[] args) {
        int boxes, people, slicesPerBox;
        double pizzaLeft, pizzaPerPerson, pizzaTotal;
        
        people = 30;
        boxes = 20;
        slicesPerBox = 15;
        pizzaTotal = (20 * 15);
        pizzaPerPerson = pizzaTotal / people;
        pizzaLeft = 
       
        
        System.out.println("There are " + (pizzaTotal) + " slices of pizza for " + (people) + " people at a party.");
        System.out.println("Each person can only have " + (pizzaPerPerson) + " slices of pizza");
        System.out.println("Bob, the party host, decided to get an extra 2 boxes of pizza for every person at the party");
        System.out.println("2 hours later, the pizza delivery guy brought in " + (2 * 20 * 15) + " more slices of pizza");
        
    }
}
