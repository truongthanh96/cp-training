import java.util.Scanner;

public class Problem268A {

  private static int solve(final int[][] team) {
    int total = 0;
    for (var host = 0; host < team.length; host++) {
      for (var guest = 0; guest < team.length; guest++) {
        if (host == guest) continue;
        final int hostColor = team[host][0];
        final int guestColor = team[guest][1];
        if (hostColor == guestColor) total += 1;
      }
    }
    return total;
  }

  private static void readAndSolve() {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    final int[][] team = new int[n][2];
    for (var i = 0; i < n; i++) {
      team[i][0] = in.nextInt();
      team[i][1] = in.nextInt();
    }
    System.out.println(solve(team));
  }

  private static void test() {
    assert solve(new int[][] {new int[] {1, 2}, new int[] {1, 2}}) == 0;
    assert solve(new int[][] {new int[] {1, 2}, new int[] {2, 4}, new int[] {3, 4}}) == 1;
    assert solve(
            new int[][] {
              new int[] {100, 42}, new int[] {42, 100}, new int[] {5, 42}, new int[] {100, 5}
            })
        == 5;
  }

  public static void main(final String[] args) {
    readAndSolve();
  }
}
