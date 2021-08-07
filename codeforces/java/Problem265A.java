import java.util.Scanner;

public class Problem265A {

  private static int solve(final String stone, final String instruction) {
    int currentStone = 0;
    for (var i = 0; i < instruction.length(); i++) {
      if (instruction.charAt(i) == stone.charAt(currentStone)) {
        currentStone++;
      }
    }
    return currentStone + 1;
  }

  private static void in() {
    final Scanner in = new Scanner(System.in);
    final String stone = in.nextLine();
    final String instruction = in.nextLine();
    System.out.println(solve(stone, instruction));
  }

  private static void test() {
    assert solve("RGB", "RRR") == 2;
    assert solve("RRRBGBRBBB", "BBBRR") == 3;
    assert solve(
            "BRRBGBRGRBGRGRRGGBGBGBRGBRGRGGGRBRRRBRBBBGRRRGGBBB",
            "BBRBGGRGRGBBBRBGRBRBBBBRBRRRBGBBGBBRRBBGGRBRRBRGRB")
        == 15;
  }

  public static void main(final String[] args) {
    in();
  }
}
