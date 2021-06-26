import java.math.BigInteger;
import java.util.Scanner;

public class Problem102B {

  private static void readAndSolve() {
    final Scanner in = new Scanner(System.in);
    final BigInteger input = in.nextBigInteger();
    System.out.println(solve(input));
  }

  private static int solve(final BigInteger input) {
    final String s = input.toString();
    if (s.length() == 1) return 0;
    int total = 0;
    int castSpellTime = 1;
    for (final var i : s.toCharArray()) {
      final int numericValue = Character.getNumericValue(i);
      total += numericValue;
      while (total > 9) {
        total = total % 10 + 1;
        castSpellTime++;
      }
    }
    return castSpellTime;
  }

  private static void test() {
    assert solve(BigInteger.valueOf(0)) == 0;
    assert solve(BigInteger.valueOf(10)) == 1;
    assert solve(BigInteger.valueOf(991)) == 3;
  }

  public static void main(final String[] args) {
    readAndSolve();
  }
}
