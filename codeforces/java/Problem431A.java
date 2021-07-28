import java.util.Scanner;

public class Problem431A {
  private static int solve(final int[] a, final String input) {
    return input.chars().map(c -> a[Character.getNumericValue(c) - 1]).sum();
  }

  private static void in() {
    final Scanner in = new Scanner(System.in);
    final int[] a = new int[4];
    for (var i = 0; i < 4; i++) {
      a[i] = in.nextInt();
    }
    final String input = in.next();
    System.out.println(solve(a, input));
  }

  private static void test() {
    assert solve(new int[] {1, 2, 3, 4}, "123214") == 13;
    assert solve(new int[] {1, 5, 3, 2}, "11221") == 13;
  }

  public static void main(final String[] args) {
    in();
  }
}
