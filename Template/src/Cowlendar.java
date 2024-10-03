import java.util.HashSet;
import java.util.Set;

public class Cowlendar {
    public static void main(String[] args) {
        // Example input
        int N = 12;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println(sumOfValidL(N, days));
    }

    private static long sumOfValidL(int N, int[] days) {
        // Find GCD of all differences
        int gcdOfDifferences = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                gcdOfDifferences = gcd(gcdOfDifferences, Math.abs(days[i] - days[j]));
            }
        }

        // Find all divisors of the GCD
        Set<Integer> divisors = allDivisors(gcdOfDifferences);

        // Check each divisor if it satisfies the condition
        long sum = 0;
        for (int L : divisors) {
            if (isValidL(L, days)) {
                sum += L;
            }
        }

        return sum;
    }

    private static boolean isValidL(int L, int[] days) {
        Set<Integer> remainders = new HashSet<>();
        for (int day : days) {
            remainders.add(day % L);
            if (remainders.size() > 3) {
                return false;
            }
        }
        return true;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static Set<Integer> allDivisors(int n) {
        Set<Integer> divisors = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
