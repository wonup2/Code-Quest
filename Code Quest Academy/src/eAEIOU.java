import java.util.*;

public class eAEIOU {
	static Scanner in;
	static int n;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		while(n-->0) {			
			solve();
		}			
	}	
	
	static void solve() {
		String s = in.nextLine().replaceAll("[^aeiuo]", "");
		System.out.println(s.length());
	}
}
