import java.util.*;
import java.io.*;

public class prob13 {
	private static final double LOW = 0.7;
	private static final double HIGH = 0.85;
	private static final double EXTRAPOLATION = 0.9;
	private static final double TARGET_TIME = 1000.0 / 90.0;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		in.nextLine();

		for (int i = 0; i < tests; i++) {
			String[] s = in.nextLine().split(" ");
			double f = Double.parseDouble(s[0]);
			double f1 = Double.parseDouble(s[1]);
			double f2 = Double.parseDouble(s[2]);
			int n = Integer.parseInt(s[3]);

			double low = LOW * TARGET_TIME;
			double high = HIGH * TARGET_TIME;
			double extrapolation = EXTRAPOLATION * TARGET_TIME;

			if (f2 > high) {
				n = Math.max(1, n - 2);
			} else if (f2 > extrapolation
					&& (f1 > extrapolation || f > extrapolation)) {
				n = Math.max(1, n - 1);
			} else if (f < low && f1 < low && f2 < low) {
				n++;
			}

			System.out.println(n);
		}

		in.close();
	}
}