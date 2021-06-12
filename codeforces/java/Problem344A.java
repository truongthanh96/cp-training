import java.util.Scanner;

public class Problem344A {


    private static void readAndSolve() {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final String[] input = new String[n];
        for (var i = 0; i < n; i++) {
            input[i] = in.nextLine();
        }
        System.out.println(solve(n, input));
    }

    private static int solve(int n, String[] input) {
        String join = String.join("", input);
        int numberOfGroup = 0;
        for (var i = 1; i < join.length(); i++) {
            if (join.charAt(i) == join.charAt(i - 1)) {
                numberOfGroup++;
            }
        }
        return numberOfGroup + 1;
    }

    private static void test() {
        assert solve(6, new String[]{
                "10",
                "10",
                "10",
                "01",
                "10",
                "10"}) == 3;
        assert solve(4, new String[]{"01",
                "01",
                "10",
                "10"}) == 2;
    }

    public static void main(final String[] args) {
        readAndSolve();
    }
}
