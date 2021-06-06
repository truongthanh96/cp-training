import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem66B {

  private static int solve(final int n, final int[] input) {
    final int[] forward = new int[n];
    forward[0] = 1;
    final int[] backward = new int[n];
    backward[n - 1] = 1;
    for (var i = 1; i < n; i++) {
      forward[i] = input[i] >= input[i - 1] ? forward[i - 1] + 1 : 1;
    }
    for (var i = n - 2; i >= 0; i--) {
      backward[i] = input[i] >= input[i + 1] ? backward[i + 1] + 1 : 1;
    }
    final int[] sumArray = new int[n];
    for (var i = 0; i < n; i++) {
      sumArray[i] = forward[i] + backward[i] - 1;
    }
    return IntStream.of(sumArray).max().getAsInt();
  }

  private static void readAndSolve() {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final int[] array = new int[n];
    for (var i = 0; i < n; i++) {
      array[i] = in.nextInt();
    }
    System.out.println(solve(n, array));
  }

  private static void test() {
    assert solve(5, new int[] {1, 2, 1, 2, 1}) == 3;
    assert solve(1, new int[] {2}) == 1;
    assert solve(8, new int[] {1, 2, 1, 1, 1, 3, 3, 4}) == 6;
  }

  public static void main(final String[] args) {
    readAndSolve();
  }
}
