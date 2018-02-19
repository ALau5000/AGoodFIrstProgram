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
        
        
        System.out.println("There are " + (pizzaTotal) + " slices of pizza available for " + (people) + " people at a party.");
        System.out.println("Each person can only have " + (pizzaPerPerson) + " slices of pizza");
        System.out.println("Bob, the party host, decided to get an extra box of pizza for every 2 people at the party");
        System.out.println("So there will be " + (pizzaTotal/2) + " extra slices available for everyone");
        System.out.println("Since each box is $" + (boxPrice) + ", then the total price is "
        
    }
}
