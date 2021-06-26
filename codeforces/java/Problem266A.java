import java.util.Scanner;

public class Problem266A {
  private static int solve(final int n, final String stones) {
    char curChar = stones.charAt(0);
    final char[] chars = stones.toCharArray();
    int charToRemove = 0;
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == curChar) {
        charToRemove++;
      } else {
        curChar = chars[i];
      }
    }
    return charToRemove;
  }

  private static void in() {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final String stones = in.next();
    System.out.println(solve(n, stones));
  }

  private static void test() {
    assert solve(3, "RRG") == 1;
    assert solve(5, "RRRRR") == 4;
    assert solve(4, "BRBG") == 0;
  }

  public static void main(final String[] args) {
    in();
  }
}
