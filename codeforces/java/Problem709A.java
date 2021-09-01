import java.util.Scanner;

public class Problem709A {

    private static int solve(final int totalOranges, int orangeLimitSize, int squeezeLimitSize, int[] a) {
        int result = 0;
        int currentTotal = 0;
        for (var i = 0; i < totalOranges; i++) {
            var currentOrange = a[i];
            if (currentOrange > orangeLimitSize) continue;
            currentTotal += currentOrange;
            if (currentTotal > squeezeLimitSize) {
                result++;
                currentTotal = 0;
            }
        }
        return result;
    }

    private static void readAndSolve() {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int b = in.nextInt();
        final int d = in.nextInt();
        final int[] a = new int[n];
        for (var i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(solve(n, b, d, a));
    }

    private static void test() {
        assert solve(2, 7, 10, new int[]{5, 6}) == 1;
        assert solve(1, 5, 10, new int[]{7}) == 0;
        assert solve(3, 10, 10, new int[]{5, 7, 7}) == 1;
        assert solve(1, 1, 1, new int[]{1}) == 0;
    }

    public static void main(final String[] args) {
        readAndSolve();
    }
}
