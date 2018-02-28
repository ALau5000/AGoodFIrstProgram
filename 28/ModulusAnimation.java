public class ModulusAnimation {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 80; i++) {
            if (i % 10 == 0)
                System.out.print("*_________* \n");
            else if (i % 10 == 1)
                System.out.print("_*_______*_ \n");
            else if (i % 10 == 2)
                System.out.print("__*_____*__ \n");
            else if (i % 10 == 3)
                System.out.print("___*___*___ \n");  
            else if (i % 10 == 4)
                System.out.print("____*_*____ \n");
            else if (i % 10 == 5)
                System.out.print("_____*_____ \n");
            else if (i % 10 == 6)
                System.out.print("____*_*____ \n");
            else if (i % 10 == 7)
                System.out.print("___*___*___ \n");
            else if (i % 10 == 8)
                System.out.print("__*_____*__ \n");
            else if (i % 10 == 9)
                System.out.print("_*_______*_ \n");               
            
            Thread.sleep(200);
        }
    }
}   
    
