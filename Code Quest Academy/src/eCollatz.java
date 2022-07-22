import java.util.*;

public class eCollatz {
	static Scanner in;
	static int n;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		while(n-->0) {
			init();
			solve();
		}			
	}
	
	static void init() {
		long num = in.nextLong();
		long ans = num;
		int cnt = 1;
		while(num!=1) {
			if(num%2==0) num/=2;
			else num = num*3+1;
			cnt++;
		}
		
		System.out.println(ans +":"+ cnt);

	}
	static void solve() {
		
	}
}
