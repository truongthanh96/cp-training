import java.util.Scanner;

public class Problem731A {
  private static int solve(final String input) {
    char currentChar = 'a';
    int totalRotate = 0;
    for (final char c : input.toCharArray()) {
      final int rotate =
          Math.min(Math.abs(getCharInt(currentChar) - getCharInt(c)), charDiff(currentChar, c));
      currentChar = c;
      totalRotate += rotate;
    }
    return totalRotate;
  }

  private static int getCharInt(final char c) {
    return c - 'a';
  }

  private static int charDiff(final char first, final char second) {
    return getCharInt(first < second ? first : second)
        - getCharInt('a')
        + getCharInt('z')
        - getCharInt(first < second ? second : first)
        + 1;
  }

  private static void in() {
    final Scanner in = new Scanner(System.in);
    final String input = in.next();
    System.out.println(solve(input));
  }

  private static void test() {
    assert solve("zeus") == 18;
    assert solve("map") == 35;
    assert solve("ares") == 34;
  }

  public static void main(final String[] args) {
    in();
  }
}
