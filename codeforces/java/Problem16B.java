import java.util.Arrays;
import java.util.Scanner;

public class Problem16B {
  private static class Data {
    public int numberOfBox;
    public int numberOfMatchPerBox;

    public Data(final int numberOfBox, final int numberOfMatchPerBox) {
      this.numberOfBox = numberOfBox;
      this.numberOfMatchPerBox = numberOfMatchPerBox;
    }
  }

  private static long solve(
      final int totalBoxCanTake, final int totalContainer, final int[] a, final int[] b) {
    final Data[] data = new Data[totalContainer];
    for (var i = 0; i < totalContainer; i++) {
      data[i] = new Data(a[i], b[i]);
    }
    Arrays.sort(data, (d1, d2) -> d2.numberOfMatchPerBox - d1.numberOfMatchPerBox);
    int currentBoxInBag = 0;
    int currentTakingBoxIndex = 0;
    long totalMatches = 0;
    while (currentBoxInBag < totalBoxCanTake && currentTakingBoxIndex < totalContainer) {
      final Data currentData = data[currentTakingBoxIndex];
      final int boxToTake = Math.min(totalBoxCanTake - currentBoxInBag, currentData.numberOfBox);
      totalMatches += (long) currentData.numberOfMatchPerBox * boxToTake;
      currentBoxInBag += boxToTake;
      currentTakingBoxIndex++;
    }
    return totalMatches;
  }

  private static void readAndSolve() {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final int m = in.nextInt();
    final int[] a = new int[m];
    final int[] b = new int[m];
    for (var i = 0; i < m; i++) {
      a[i] = in.nextInt();
      b[i] = in.nextInt();
    }
    System.out.println(solve(n, m, a, b));
  }

  private static void test() {
    assert solve(7, 3, new int[] {5, 2, 3}, new int[] {10, 5, 6}) == 62;
    assert solve(3, 3, new int[] {1, 2, 3}, new int[] {3, 2, 1}) == 7;
  }

  public static void main(final String[] args) {
    readAndSolve();
  }
}
