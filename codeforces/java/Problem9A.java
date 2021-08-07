import java.util.Scanner;

public class Problem9A {

  private static String solve(final int firstRoll, final int secondRoll) {
    //    final int chance =
    //        firstRoll == secondRoll ? 7 - firstRoll : 6 - Math.max(firstRoll, secondRoll);
    final int chance = 7 - Math.max(firstRoll, secondRoll);
    switch (chance) {
      case 0:
        return "0/1";
      case 1:
        return "1/6";
      case 2:
        return "1/3";
      case 3:
        return "1/2";
      case 4:
        return "2/3";
      case 5:
        return "5/6";
      case 6:
        return "1/1";
    }
    throw new RuntimeException("Not supported + " + chance);
  }

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
