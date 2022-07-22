import java.util.*;

public class Money {

	static Scanner in;
	static int t, n;
	static String country;
	static pair[] a;
	
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		t = in.nextInt();
		while(t-->0) {
			init();
			solve();
		}
	}

	static void init() {
		country = in.next();
		n = in.nextInt();
		a = new pair[n];
		for(int i=0; i<n; i++)
			a[i] = new pair(in.nextDouble(), in.nextInt());
	}
	
	static void solve() {
		
		Arrays.sort(a);
		
		System.out.println(country +":");
		
		for(int i=0; i<n; i++) {
			
			System.out.print(a[i].year+" ");			
			int m = (int)Math.round(a[i].money/1000);			
			for(int j=0; j<m; j++)
				System.out.print("*");
			
			System.out.println();
		}
		
	}
	static class pair implements Comparable<pair>{
		
		int year;
		double money;
		
		pair(double m, int y){
			year = y;
			money = m;
		}
		
		public String toString() {
			return year+" "+money;
		}
		@Override
		public int compareTo(Money.pair o) {
			return this.year - o.year;
		}
		
	}
}
