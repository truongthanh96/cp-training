import java.util.Scanner;

public class Problem463B {


    private static void readAndSolve() {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int[] pylonHeight = new int[n];
        for (var i = 0; i < n; i++) {
            pylonHeight[i] = in.nextInt();
        }
        System.out.println(solve(n, pylonHeight));
    }

    private static int solve(int n, int[] pylonHeight) {
        int currentEnergy = 0;
        int prevHeight = 0;
        int currentDollar = 0;
        for (int currentHeight : pylonHeight) {
            if (currentHeight > prevHeight) {
                int diffHeight = currentHeight - prevHeight;
                if (diffHeight > currentEnergy) {
                    currentDollar += diffHeight - currentEnergy;
                    currentEnergy = 0;
                } else {
                    currentEnergy -= diffHeight;
                }
            } else {
                currentEnergy += prevHeight - currentHeight;
            }
            prevHeight = currentHeight;
        }
        return currentDollar;
    }

    private static void test() {
        assert solve(5, new int[]{3, 4, 3, 2, 4}) == 4;
        assert solve(3, new int[]{4, 4, 4}) == 4;
    }

    public static void main(final String[] args) {
        readAndSolve();
    }
}
