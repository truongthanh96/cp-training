import java.util.Scanner;

public class Problem732A {

  private static int solve(final int k, final int r) {
    final String s = String.valueOf(k);
    final int finalInt = Character.getNumericValue(s.charAt(s.length() - 1));
    if (finalInt == r) return 1;
    int currentInt = finalInt;
    int currentBuy = 1;
    while (currentInt != r && currentInt != 0) {
      currentBuy++;
      currentInt = finalInt * currentBuy;
      currentInt %= 10;
    }
    return currentBuy;
  }

  private static void readAndSolve() {
    final Scanner in = new Scanner(System.in);
    final int k = in.nextInt();
    final int r = in.nextInt();
    System.out.println(solve(k, r));
  }

  private static void test() {
    assert solve(117, 3) == 9;
    assert solve(237, 7) == 1;
    assert solve(15, 2) == 2;
  }

  public static void main(final String[] args) {
    readAndSolve();
  }
}
