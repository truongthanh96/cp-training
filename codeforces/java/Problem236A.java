import java.util.Scanner;

public class Problem236A {
  private static final String GIRL = "CHAT WITH HER!";
  private static final String BOY = "IGNORE HIM!";

  private static String solve(final String username) {
    final long distinctChar = username.chars().distinct().count();
    return (distinctChar & 1) == 0 ? GIRL : BOY;
  }

  private static void in() {
    final Scanner in = new Scanner(System.in);
    final String username = in.nextLine();
    System.out.println(solve(username));
  }

  private static void test() {
    assert solve("wjmzbmr").equals(GIRL);
    assert solve("xiaodao").equals(BOY);
    assert solve("sevenkplus").equals(GIRL);
  }

  public static void main(final String[] args) {
    in();
  }
}
