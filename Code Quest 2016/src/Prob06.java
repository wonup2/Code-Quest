import java.util.*;

public class Prob06 {

	static Scanner in;
	static int t, n;

	static class triple implements Comparable<triple>{
 
		String name;
		double score;
		int credit;
		
		triple(String n, double s, int c){
			name =n;
			score = s;
			credit =c;
		}
		
		public String toString() {
			return name +" "+score+" "+credit;
		}
		@Override
		public int compareTo(Prob06.triple o) {
			
			if(this.score == o.score) {
				if(o.credit < this.credit) return -1;
				else return 1;
			}
			else if(o.score<this.score) return -1;
			else return 1;
		}
		
	}
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		t = in.nextInt(); in.nextLine();
		
		while(t-->0) {
			init();
			solve();
		}
	}

	static void init() {
		
		String school = in.nextLine();	
		
		n = in.nextInt(); in.nextLine();
				
		
		triple vale[] = new triple[n];
		
		for(int i=0; i<n; i++) {
			String s = in.nextLine();
			int idx = s.indexOf(":");
			String name = s.substring(0, idx);
			String a[] = s.substring(idx+1).split(",");
			
			int score=0;
			int credit=0;
			
			for(int j=0; j<a.length; j++) {
				int grade = convert(a[j].charAt(0));
				int c = a[j].charAt(1)-'0';
				
				score+=grade*c;
				credit+=c;
			}
			
			vale[i] = new triple(name, score/(credit*1.0), credit);
		}
		
		Arrays.sort(vale);
		//System.out.println(Arrays.toString(vale));
		
		System.out.println(school +" = " + vale[0].name);
	}
	
	static int convert(char c) {
		if(c=='A') return 4;
		else if(c=='B') return 3;
		else if(c=='C') return 2;
		else return 1;
	}
	
	static void solve() {		
		
	}
}
