import java.util.*;

public class eChange {
	static Scanner in;
	static String s;
	static int n, m;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		while(n-->0) {
			init();
			solve();
		}			
	}
	
	static void init() {
		
		s = in.next();
		m = Integer.parseInt(s.substring(1).replace(".", ""));

	}
	static void solve() { 
		
		System.out.println(s);
		System.out.println("Quarters="+(m/25));
		m%=25;
		System.out.println("Dimes="+(m/10));
		m%=10;
		System.out.println("Nickels="+(m/5));
		m%=5;
		System.out.println("Pennies="+m);
	}
}

/*
4
$3.87
$2.74
$14.84
$0.76

*/