import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem294A {

    private static List<Integer> solve(int n, final int[] birdOnWires, int m, final int[][] shoot) {
        for (var i = 0; i < m; i++) {
            var current_shot = shoot[i];
            var wire = current_shot[0];
            var position = current_shot[1];
            var birdOnWire = birdOnWires[wire - 1];
            var leftBird = position - 1;
            var rightBird = birdOnWire - position;
            if (leftBird > 0 && wire > 1) {
                birdOnWires[wire - 2] += leftBird;
            }
            if (rightBird > 0 && wire < n) {
                birdOnWires[wire] += rightBird;
            }
            birdOnWires[wire - 1] = 0;
        }
        return Arrays.stream(birdOnWires).boxed().collect(Collectors.toList());
    }

    private static List<Integer> readAndSolve() {
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] birdOnWires = new int[n];
        for (var i = 0; i < n; i++) {
            birdOnWires[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[][] shoot = new int[m][2];
        for (var i = 0; i < m; i++) {
            shoot[i][0] = in.nextInt();
            shoot[i][1] = in.nextInt();
        }
        List<Integer> solve = solve(n, birdOnWires, m, shoot);
        for (Integer integer : solve) {
            System.out.println(integer);
        }
        return solve;
    }

    private static void test() {
        assert solve(5,
                new int[]{10, 10, 10, 10, 10},
                5,
                new int[][]{new int[]{2, 5}, new int[]{3, 13}, new int[]{2, 12}, new int[]{1, 13}, new int[]{4, 6}}
        ).equals(Arrays.asList(0,
                12,
                5,
                0,
                16));
    }

    public static void main(final String[] args) {
        readAndSolve();
    }
}
