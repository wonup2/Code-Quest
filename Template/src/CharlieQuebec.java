import java.util.*;
import java.io.*;

public class CharlieQuebec {
	
	static Scanner in;
	static int t, n, wordcnt;
	static String word, spl[], ans;
	
	
	static void solve() {
		
		ans ="";
		for(int i=0; i<spl.length; i++) {
			if(spl[i].equals("A")) {
				ans +=("Alpha-");
			}
			else if(spl[i].equals("B")) {
				ans+=("Bravo-");
			}
			else if(spl[i].equals("C")) {
				ans+=("Charlie-");
			}
			else if(spl[i].equals("D")) {
				ans+=("Delta-");
			}
			else if(spl[i].equals("E")) {
				ans+=("Echo-");
			}
			else if(spl[i].equals("F")) {
				ans+=("Foxtrot-");
			}
			else if(spl[i].equals("G")) {
				ans+=("Golf-");
			}
			else if(spl[i].equals("H")) {
				ans+=("Hotel-");
			}
			else if(spl[i].equals("I")) {
				ans+=("India-");
			}
			else if(spl[i].equals("J")) {
				ans+=("Juliet-");
			}
			else if(spl[i].equals("K")) {
				ans+=("Kilo-");
			}
			else if(spl[i].equals("L")) {
				ans+=("Lima-");
			}
			else if(spl[i].equals("M")) {
				ans+=("Mike-");
			}
			else if(spl[i].equals("N")) {
				ans+=("November-");
			}
			else if(spl[i].equals("O")) {
				ans+=("Oscar-");
			}
			else if(spl[i].equals("P")) {
				ans+=("Papa-");
			}
			else if(spl[i].equals("Q")) {
				ans+=("Quebec-");
			}
			else if(spl[i].equals("R")) {
				ans+=("Romeo-");
			}
			else if(spl[i].equals("S")) {
				ans+=("Sierra-");
			}
			else if(spl[i].equals("T")) {
				ans+=("Tango-");
			}
			else if(spl[i].equals("U")) {
				ans+=("Uniform-");
			}
			else if(spl[i].equals("V")) {
				ans+=("Victor-");
			}
			else if(spl[i].equals("W")) {
				ans+=("Whiskey-");
			}
			else if(spl[i].equals("X")) {
				ans+=("Xray-");
			}
			else if(spl[i].equals("Y")) {
				ans+=("Yankee-");
			}
			else if(spl[i].equals("Z")) {
				ans+=("Zulu-");
			}
			else ans= ans.substring(0,ans.length()-1)+spl[i];
			
		}
		System.out.println(ans.substring(0,ans.length()-1));
		
		
	}
	
	static void init() {	
	
		
		wordcnt = in.nextInt(); in.nextLine();
		for(int i=0; i<wordcnt; i++) {
			word = in.nextLine().toUpperCase();
			spl = word.split("");
			System.out.println(Arrays.toString(spl));
			solve();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		t = in.nextInt(); in.nextLine();
		while(t --> 0) {
			init();
		}
		
	}
	
	static class mine implements Comparable<mine>{
		
		String s;
		int n;
		
		mine(String a, int b){
			s = a;
			n = b;
		}
		
		public String toString() {
			return s + " " + n;
		}
		
		@Override
		public int compareTo(mine that) {
			
			return this.n-that.n; // sort by n Ascending
			
			//return that.n - this.n; // sort by n Descending
			
			/*if(this.n == that.n) {
				if(this.s.compareTo(that.s) < 0) return -1;
				else return 1;
			}
			else return that.n-this.n;
			
			printf("%.1f", ans)
			*/
			
			
		}
		
		
	}
	
}
