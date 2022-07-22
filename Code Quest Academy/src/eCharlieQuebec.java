import java.util.*;

public class eCharlieQuebec {
	static Scanner in;
	static int t, n;
	static String nato[] = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", 
							"Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", 
							"Sierra", "Tango", "Uniform", "Victor", "Whiskey", "Xray", "Yankee", "Zulu"};
	static String a[];
	public static void main(String[] args) {

		in = new Scanner (System.in);
		t = in.nextInt(); in.nextLine();

		while(t-->0) solve();		
	}
		
	static void solve() {
		n = in.nextInt(); in.nextLine();
		while(n-->0) {
			String s = in.nextLine().toUpperCase();
			String ans = "";
			
			for(int i=0; i<s.length(); i++) {
				int num = s.charAt(i)-'A';
				if(0 <= num && num < 26) ans += nato[num]+"-";
				else ans = ans.substring(0,ans.length()-1)+" ";				
			}
			System.out.println(ans.substring(0,ans.length()-1));
		}
	}
}

