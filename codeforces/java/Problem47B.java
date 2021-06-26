import java.util.Map;
import java.util.Scanner;

public class Problem47B {
  static final Map<Character, Integer> map = Map.of('A', 0, 'B', 1, 'C', 2);
  static final String IMPOSSIBLE = "Impossible";

  private static String solve(final String first, final String second, final String third) {
    final int[][] compareMatrix = new int[3][3];
    fillInPair(first, compareMatrix);
    fillInPair(second, compareMatrix);
    fillInPair(third, compareMatrix);
    final char[] sequence = {0, 0, 0};
    try {
      return find(sequence, compareMatrix);
    } catch (final ImpossibleException e) {
      return IMPOSSIBLE;
    }
  }

  private static String find(final char[] sequence, final int[][] compareMatrix)
      throws ImpossibleException {
    for (final Character character : map.keySet()) {
      int total = 0;
      for (final Character leftOver : map.keySet()) {
        if (leftOver.equals(character)) continue;
        total += compareMatrix[map.get(character)][map.get(leftOver)];
      }
      switch (total) {
        case 2:
          fill(sequence, 2, character);
          break;
        case -2:
          fill(sequence, 0, character);
          break;
        case 0:
          fill(sequence, 1, character);
          break;
        default:
          throw new ImpossibleException();
      }
    }
    return String.valueOf(sequence);
  }

  private static void fill(final char[] sequence, final int index, final char coin)
      throws ImpossibleException {
    if (sequence[index] != 0) {
      throw new ImpossibleException();
    }
    sequence[index] = coin;
  }

  private static void fillInPair(final String pair, final int[][] matrix) {
    final char first = pair.charAt(0);
    final char second = pair.charAt(2);
    final char operator = pair.charAt(1);
    final int ops = operator == '>' ? 1 : -1;
    matrix[map.get(first)][map.get(second)] = ops;
    matrix[map.get(second)][map.get(first)] = -1 * ops;
  }

  private static void in() {
    final Scanner in = new Scanner(System.in);
    final String first = in.next();
    final String second = in.next();
    final String third = in.next();
    System.out.println(solve(first, second, third));
  }

  private static void test() {
    assert solve("A>B", "C<B", "A>C").equals("CBA");
    assert solve("A<B", "B>C", "C>A").equals("ACB");
    assert solve("A>B", "B>C", "C>A").equals(IMPOSSIBLE);
  }

  public static void main(final String[] args) {
    in();
  }

  public static class ImpossibleException extends Exception {}
}
