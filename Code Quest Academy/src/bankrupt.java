import java.util.*;
import java.io.*;

public class bankrupt {

    static class Tank {
        int cap, idx;
        Tank(int c, int i) { cap = c; idx = i; }
    }
    static Scanner in;
    static long X;      // total fuel
    static int N;       // number of tanks
    static int[] caps;  // tank capacities (original order)
    static Tank[] arr;  // (capacity, original index) pairs
    static String[] ans;

    public static void main(String[] args) throws IOException {
        in = new Scanner(System.in);

        int T = in.nextInt();          // number of test cases
        for (int tc = 0; tc < T; tc++) {
            init();                    // read one test case
            solve();                   // compute + output result
        }

        System.out.close();
        in.close();
    }

    static void init() {
        X = in.nextLong();             // total fuel
        N = in.nextInt();              // number of tanks
        caps = new int[N];
        for (int i = 0; i < N; i++) caps[i] = in.nextInt();

        arr = new Tank[N];
        for (int i = 0; i < N; i++) arr[i] = new Tank(caps[i], i);
        Arrays.sort(arr, Comparator.comparingInt(t -> t.cap));
        ans = new String[N];           // output values per tank
    }

    static void solve() {
        long L = 0;     // current water level shared by all active tanks
        long R = X;     // remaining fuel
        int i = 0;      // tanks [0..i-1] are already full


        while (i < N) {
            int m = N - i;                 // number of active tanks
            long nextCap = arr[i].cap;     // next tank’s capacity
            long need = (nextCap - L) * (long)m; 

            if (need <= R && nextCap >= L) {
                // enough fuel to fill this tank completely
                R -= need;
                L = nextCap;
                i++;
            } else break;                  // not enough fuel → stop
        }

        if (i == N) {// (edge case, rare) all tanks are completely full
            for (Tank t : arr) ans[t.idx] = Integer.toString(t.cap);
        } 
        else { // compute the final shared level for the remaining tanks
int m = N - i;
            long num = L * (long)m + R;   // numerator of final level
            long den = m;                 // denominator of final level
            String finalStr = fracStr(num, den);

            // assign results
            for (int j = 0; j < i; j++) 
ans[arr[j].idx] = Integer.toString(arr[j].cap);             for (int j = i; j < N; j++) 
ans[arr[j].idx] = finalStr;  // partial tanks
        }

        // print ouput
        for (int k = 0; k < N; k++) {
            if (k > 0) System.out.print(" ");
           	System.out.print(ans[k]);
        }
        System.out.println();
    }

    // greatest common divisor
    static long gcd(long a, long b) {
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) {
            long t = a % b;
            a = b; b = t;
        }
        return a;
    }

    // convert fraction a/b to reduced string form
    static String fracStr(long a, long b) {
        long g = gcd(a, b);
        a /= g; b /= g;
        if (b == 1) return Long.toString(a); // integer
        return a + "/" + b;                  // fraction
    }
}
