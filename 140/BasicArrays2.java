import java.util.Random;

public class BasicArrays2 {
  public static void main(String[] args) {
    Random r = new Random();
    
    int[] tenInt = new int[10];
    tenInt[0] = r.nextInt(100) + 1;
    tenInt[1] = r.nextInt(100) + 1;
    tenInt[2] = r.nextInt(100) + 1;
    tenInt[3] = r.nextInt(100) + 1;
    tenInt[4] = r.nextInt(100) + 1;
    tenInt[5] = r.nextInt(100) + 1;
    tenInt[6] = r.nextInt(100) + 1;
    tenInt[7] = r.nextInt(100) + 1;
    tenInt[8] = r.nextInt(100) + 1;
    tenInt[9] = r.nextInt(100) + 1;
    
    for (int i = 0; i < tenInt.length; i += 1) {
      System.out.println("Slot " + i + " contains a " + tenInt[i]);
    }
  }
}
