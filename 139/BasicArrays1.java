public class BasicArrays1 {
  public static void main(String[] args) {
    
    int[] tenInt = new int[10];
    tenInt[0] = -113;
    tenInt[1] = -113;
    tenInt[2] = -113;
    tenInt[3] = -113;
    tenInt[4] = -113;
    tenInt[5] = -113;
    tenInt[6] = -113;
    tenInt[7] = -113;
    tenInt[8] = -113;
    tenInt[9] = -113;
    
    for (int i = 0; i < tenInt.length; i += 1) {
      System.out.println("Slot " + i + " contains a " + tenInt[i]);
    }
  }
}
