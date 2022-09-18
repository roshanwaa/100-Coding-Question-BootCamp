import java.lang.Math;
import java.util.Scanner;

public class PerfectNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int test = sc.nextInt();

    while (test-- > 0) {
      int n = sc.nextInt();
      n = (int) Math.sqrt(n);
      int sum = 0, x = 2;

      while (x <= n) {
        if (n % x == 0) {
          sum += x;
          x++;
        }
      }
      if (sum == n) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
