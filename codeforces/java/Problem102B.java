import java.math.BigInteger;
import java.util.Scanner;

public class Problem102B {

    private static void readAndSolve() {
        Scanner in = new Scanner(System.in);
        BigInteger input = in.nextBigInteger();
        System.out.println(solve(input));
    }

    private static int solve(BigInteger input) {
        String s = input.toString();
        if (s.length() == 1) return 0;
        int total = 0;
        int castSpellTime = 1;
        for (var i : s.toCharArray()) {
            int numericValue = Character.getNumericValue(i);
            total += numericValue;
            while (total > 9) {
                total = String.valueOf(total).chars().map(Character::getNumericValue).sum();
                castSpellTime++;
            }
        }
        return castSpellTime;
    }

    private static void test() {
        assert solve(BigInteger.valueOf(0)) == 0;
        assert solve(BigInteger.valueOf(10)) == 1;
        assert solve(BigInteger.valueOf(991)) == 3;
        assert solve(BigInteger.valueOf(123456789)) == 2;
    }

    public static void main(String[] args) {
        test();
    }
}