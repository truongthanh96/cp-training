import java.util.Scanner;

public class Problem294A {

  private static String solve(final int[] birdOnWires, final int[][] shoot) {}

  private static void readAndSolve() {
    final Scanner in = new Scanner(System.in);
    System.out.println(solve(in.nextInt(), in.nextInt()));
  }

  private static void test() {
    assert solve(4, 2).equals("1/2");
  }

  public static void main(final String[] args) {
    readAndSolve();
  }
}
