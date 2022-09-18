import java.util.Scanner;

/***
 * Reversenumber
 */
public class Reversenumber {

  public static void main(String[] args) {
    System.out.println("Hello");
    System.out.println("Enter a Number:");

    try (Scanner sc = new Scanner(System.in)) {
      int testCase = sc.nextInt();
      while (testCase-- > 0) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int revA = reverse(a);
        int revB = reverse(b);
        int ans = reverse(revA + revB);
        System.out.println(ans);
      }
    }
  }

  static int reverse(int x) {
    int ans = 0;
    while (x > 0) {
      int d = x % 10;
      ans = ans * 10 + d;
      x = x / 10;
    }
    return ans;
  }
}
