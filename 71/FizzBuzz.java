public class FizzBuzz {
  public static void main(String[] args) {
    for (int x = 1; x <= 100; x += 1) {
      if (x % 3 == 0) {
        System.out.print("Fizz\n");
      } else if (x % 5 == 0) {
        System.out.print("Buzz\n");
      } else {
        System.out.println(x);
      }
    }
  }
}
