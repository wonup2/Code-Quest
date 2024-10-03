import java.util.*;

public class Prob08 implements Comparable<Prob08> {

	static Scanner in;
	static int t, n;

	static class pair implements Comparable<pair>{
 
		String title, singer1, singer2;
		
		pair(String t, String s){
			title = t;
			singer1 = s;
			singer2 = singer1.toLowerCase();
			if(singer2.startsWith("the "))
				singer2 = singer2.substring(4);
		}
		
		public String toString() {
			return title  +" - "+singer1;
		}
		
		@Override
		public int compareTo(Prob08.pair o) {
						
			if(this.singer2.equals (o.singer2)) {
				return this.title.compareTo(o.title);
			}
			else return this.singer2.compareTo(o.singer2);
		}		
	}
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		t = in.nextInt(); in.nextLine();
		
		while(t-->0) solve();		
	}

	static void solve() {
				
		n = in.nextInt(); in.nextLine();
		
		pair a[] = new pair[n];
		
		for(int i=0; i<n; i++) {
			String s[] = in.nextLine().split(" - ");
			a[i] = new pair(s[0], s[1]); 
		}		
		
		Arrays.sort(a);		
		for(pair p:a)
			System.out.println(p);

	}

	@Override
	public int compareTo(Prob08 o) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
