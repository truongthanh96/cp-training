import java.util.Scanner;

public class Problem59A {

  private static String solve(final String input) {
    final long numberOfUpperCase = countUpperCase(input);
    return numberOfUpperCase > Math.floorDiv(input.length(), 2)
        ? input.toUpperCase()
        : input.toLowerCase();
  }

  private static long countUpperCase(final String input) {
    return input.chars().filter(Character::isUpperCase).count();
  }

  private static void in() {
    final Scanner in = new Scanner(System.in);
    final String input = in.nextLine();
    System.out.println(solve(input));
  }

  private static void test() {
    assert solve("HoUse").equals("house");
    assert solve("ViP").equals("VIP");
    assert solve("maTRIx").equals("matrix");
  }

  public static void main(final String[] args) {
    in();
  }
}
