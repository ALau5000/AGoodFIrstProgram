import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hey buddy, what's your name or name you prefer to be called?" );
        String name = input.next();
                
        System.out.println("Hi, " + name + "! How old are you???");
        String birthday = input.next();
        
        System.out.println("WOWOWOWOWOWOOWOWOW!! You're pretty old. ");
        System.out.println("You might want to retire soon! Anyway, how much you make? ");
        double salary = input.nextDouble();
        
        System.out.println("Only $" + salary + "?? Wow you're job must suck. JK LOLOLOLOLOLOLOLOLOLOLOLOLOLOL!!!!!!");
    }
} 
