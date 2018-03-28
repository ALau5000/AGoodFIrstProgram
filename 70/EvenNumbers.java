public class EvenNumbers {
  public static void main(String[] args) {
    for (int x = 1; x <= 20; x += 1) {
      if (x % 2 == 0) {
        System.out.println(x + " EVEN!!!");
      } else {
        System.out.println(x + " ODD!!!");
      }
    }
  }
}
