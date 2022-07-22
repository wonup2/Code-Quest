import java.util.*;

public class eAnagram {
	static Scanner in;
	static int n;
	static String s[], input;
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		while(n-->0) {
			init();
			solve();
		}			
	}
	
	static void init() {
		input = in.nextLine();
		s = input.split("\\|");
	}
	static void solve() {
		
		System.out.print(input +" = ");
		
		if(s[0].equals(s[1])) System.out.println("NOT AN ANAGRAM");
		else if(check()) System.out.println("ANAGRAM");
		else System.out.println("NOT AN ANAGRAM");
		
	}
	
	static boolean check() {
		char a[] = s[0].toCharArray();
		char b[] = s[1].toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a,b);

	}
}
