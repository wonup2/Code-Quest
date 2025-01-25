import java.util.*;
import java.io.*;

public class eAreYouASpy {
	
	static Scanner in;
	static int t;
	static HashSet<Character> set1, set2;

	static void solve() {	
				
		String ans = "That's my secret contact!";
		for(char c: set2) {
			if(!set1.contains(c)) {
				ans = "You're not a secret agent!";
				break;
			}
		}
		System.out.println(ans);			
	}
	
	static void init() {
		
		String word = in.nextLine().toLowerCase();
		String[] temp = word.split("\\|");
		temp[0] = temp[0].replaceAll("[^a-z]", "");
		temp[1] = temp[1].replaceAll("[^a-z]", "");

		set1 = new HashSet<Character>();		
		set2 = new HashSet<Character>();

		for(int i=0; i<temp[0].length(); i++) set1.add(temp[0].charAt(i));
		for(int i=0; i<temp[1].length(); i++) set2.add(temp[1].charAt(i));
	}
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		t = in.nextInt(); in.nextLine();
		while(t --> 0) {
			init();
			solve();
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
			else return that.n-this.n;*/
		}
		
		
	}
	
}