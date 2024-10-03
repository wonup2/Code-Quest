import java.util.Scanner;

public class hTowerOfHanoi {
    static Scanner in;
    static int t;
    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int disks = in.nextInt();
            System.out.println(disks);
            solve(disks, 'A', 'C', 'B');
        }

        in.close();
    }

    private static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println(from + "->" + to);
            return;
        }
        solve(n - 1, from, aux, to);
        System.out.println(from + "->" + to);
        solve(n - 1, aux, to, from);
    }
}
