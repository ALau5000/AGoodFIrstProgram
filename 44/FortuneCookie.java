import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random r = new Random();
        
        String fortuneMsg = "";
                
        int lotto1 = 1 + r.nextInt(54);
        int lotto2 = 1 + r.nextInt(54);
        int lotto3 = 1 + r.nextInt(54);
        int lotto4 = 1 + r.nextInt(54);
        int lotto5 = 1 + r.nextInt(54);
        int lotto6 = 1 + r.nextInt(54);
        
        int fortuneValue = 1 + r.nextInt(6); 
        
        if (fortuneValue == 1) {
            fortuneMsg = "You will have bad luck forever.";
        } else if (fortuneValue == 2) {
            fortuneMsg = "People will hate you forever.";
        } else if (fortuneValue == 3) {
            fortuneMsg = "You will be alone the rest of your life.";
        } else if (fortuneValue == 4) {
            fortuneMsg = "You will be homeless in the future.";
        } else if (fortuneValue == 5) {
            fortuneMsg = "You will suffer the rest of your life.";
        } else if (fortuneValue == 6) {
            fortuneMsg = "You will be bald.";
        } 
        
        System.out.println("Fortune cookie says: " + fortuneMsg);
        System.out.println(lotto1 + "-" + lotto2 + "-" + lotto3 + "-" + lotto4 + "-" + lotto5 + "-" + lotto6);
    }
}
