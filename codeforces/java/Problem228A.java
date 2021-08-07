import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem228A {

  private static int solve(final int[] input) {
    return 4 - (IntStream.of(input).boxed().collect(Collectors.toSet())).size();
  }

  private static void readAndSolve() {
    final Scanner in = new Scanner(System.in);
    final int n = 4;
    final int[] array = new int[n];
    for (var i = 0; i < n; i++) {
      array[i] = in.nextInt();
    }
    System.out.println(solve(array));
  }

  private static void test() {
    assert solve(new int[] {1, 7, 3, 3}) == 1;
    assert solve(new int[] {7, 7, 7, 7}) == 3;
  }

  public static void main(final String[] args) {
    readAndSolve();
  }
}
