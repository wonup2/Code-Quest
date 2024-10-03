import java.util.*;

public class _Tempilate {
	
	static Scanner in;
	static int t, n;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		t = in.nextInt(); in.nextLine();
		while(t-->0) {
			init();
			solve();
		}	
	}
	
	static void init() {
		
		n = in.nextInt();
		
		

	}
	static void solve() {
		
	}
	
	static class pair implements Comparable<pair>{

		int len;
		String word;
		
		pair(int x, String y){
			len = x;
			word = y;
		}
		
		public String toString() {
			return len+" "+word;
		}
		
		@Override
		public int compareTo(pair o) {
			return this.len-o.len;
		}
	}
}
