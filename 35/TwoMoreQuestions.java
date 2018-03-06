import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String thing = "";
        
        System.out.println("ONLY TWO MORE QUESTIONS!!!!!!!!!!!!!!!!!!!\n");
        System.out.println("Think of something and I'll try to guess it!\n");
        System.out.print("Questions 1) Does it stay inside or both? ");
        String location = input.next();
        System.out.print("Question 2) Is it a living thing? ");
		String livingThing = input.next();
        System.out.println();
		
		if (location.equals("inside") && livingThing.equals("yes")) {
			thing = "houseplant"; 	
		} else if (location.equals("inside") && livingThing.equals("no")) {
			thing = "shower curtain";
		} else if (location.equals("outside") && livingThing.equals("yes")) {
			thing = "bison";
		} else if (location.equals("outside") && livingThing.equals("no")) {
			thing = "billboard";
		} else if (location.equals("both") && livingThing.equals("yes")) {
			thing = "dog";
		} else if (location.equals("both") && livingThing.equals("no")) {
			thing = "cellphone";
		}
		
		System.out.println("What else could you be thinking of besides a " + thing + ".");
    }
}
  
