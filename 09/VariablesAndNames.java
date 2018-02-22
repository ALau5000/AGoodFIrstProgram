public class VariablesAndNames {
    
    public static void main(String[] args) {
        int boxes, people, slicesPerBox;
        double pizzaPerPerson, pizzaTotal, boxPrice;
        
        people = 30;
        boxes = 20;
        boxPrice = 15;
        slicesPerBox = 15;
        pizzaTotal = (20 * 15);
        pizzaPerPerson = pizzaTotal / people;
        
        
        System.out.println("There are " + boxes + " boxes of pizza and " + pizzaTotal + " slices of pizza available for " + people + " people at a party.");
        System.out.println("To split it evenly between every person, one person can only have " + pizzaPerPerson + " slices of pizza.");
        System.out.println("Bob, the party host, decided to order an extra box of pizza for every 2 people at the party.");
        System.out.println("So there will be " + pizzaTotal/2 + " extra slices available for everyone after the delivery has arrived.");
        System.out.println("Since each box is $" + boxPrice + ", then the total price would be $" + (boxes * boxPrice + (people/2 * boxPrice)) + " for every pizza box");
        
    }
}
