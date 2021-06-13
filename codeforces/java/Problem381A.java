import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem381A {


    private static void readAndSolve() {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int[] array = new int[n];
        for (var i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int[] solve = solve(n, array);
        System.out.println(solve[0]);
        System.out.println(solve[1]);
    }

    private static int[] solve(int n, int[] array) {
        var cardsLeft = new LinkedList<Integer>();
        for (int i : array) {
            cardsLeft.push(i);
        }
        int[] playerPoints = new int[]{0, 0};
        int currentPlayer = 0;
        while (!cardsLeft.isEmpty()) {
            int point;
            if (cardsLeft.peekFirst() > cardsLeft.peekLast()) {
                point = cardsLeft.pollFirst();
            } else {
                point = cardsLeft.pollLast();
            }
            playerPoints[currentPlayer] += point;
            if (currentPlayer == 0) currentPlayer = 1;
            else currentPlayer = 0;
        }
        return playerPoints;
    }

    private static void test() {
        assert Arrays.equals(solve(4, new int[]{4, 1, 2, 10}), new int[]{12, 5});
        assert Arrays.equals(solve(7, new int[]{1, 2, 3, 4, 5, 6, 7}), new int[]{16, 12});
    }

    public static void main(final String[] args) {
        readAndSolve();
    }
}
