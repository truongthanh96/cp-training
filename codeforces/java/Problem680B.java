import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem680B {

  private static int solve(final int n, final int a, final int[] input) {
    int total = 0;
    final int aIndex = a - 1;
    int forward = aIndex + 1;
    int backward = aIndex - 1;
    if (input[aIndex] == 1) total += 1;
    while (forward < n && backward >= 0) {
      if (input[forward] + input[backward] == 2) total += 2;
      forward++;
      backward--;
    }
    if (forward < n) {
      total +=
          Arrays.stream(input).boxed().collect(Collectors.toList()).subList(forward, n).stream()
              .mapToInt(Integer::intValue)
              .sum();
    }

    if (backward > 0) {
      total +=
          Arrays.stream(input)
              .boxed()
              .collect(Collectors.toList())
              .subList(0, backward + 1)
              .stream()
              .mapToInt(Integer::intValue)
              .sum();
    }
    return total;
  }

  private static void readAndSolve() {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final int a = in.nextInt();
    final int[] array = new int[n];
    for (var i = 0; i < n; i++) {
      array[i] = in.nextInt();
    }
    System.out.println(solve(n, a, array));
  }

  private static void test() {
    assert solve(6, 3, new int[] {1, 1, 1, 0, 1, 0}) == 3;
    assert solve(5, 2, new int[] {0, 0, 0, 1, 0}) == 1;
    assert solve(1, 1, new int[] {1}) == 1;
    assert solve(1, 1, new int[] {0}) == 0;
  }

  public static void main(final String[] args) {
    readAndSolve();
  }
}
