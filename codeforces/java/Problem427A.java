import java.util.Scanner;

import static java.lang.Math.abs;

public class Problem427A {

  private static int solve(final int n, final int[] input) {
    int currentPolices = 0;
    int untreatedCrimes = 0;
    for (final var i : input) {
      if (i < 0) {
        currentPolices += i;
        if (currentPolices < 0) {
          untreatedCrimes += abs(currentPolices);
          currentPolices = 0;
        }
      } else {
        currentPolices += i;
      }
    }
    return untreatedCrimes;
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
    assert solve(3, new int[] {-1, -1, 1}) == 2;
    assert solve(8, new int[] {1, -1, 1, -1, -1, 1, 1, 1}) == 1;
    assert solve(11, new int[] {-1, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1}) == 8;
  }

  public static void main(final String[] args) {
    readAndSolve();
  }
}
