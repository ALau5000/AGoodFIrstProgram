public class Main {
  public static void main(String[] args) {
    System.out.println("x\t\ty");
    System.out.println("------------------------");
    
    for (double x = -10; x <= 10; x += 0.5) {
      System.out.print(x + "\t\t");
      System.out.println(Math.pow(x,2));
    }
  }
}
