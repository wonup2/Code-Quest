import java.util.*;

public class eAddiply {
	static Scanner in;
	static int n;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt();
		while(n-->0) solve();
	}
	static void solve() {
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a+b+" " +a*b);
	}

}
