import java.util.*;
import java.io.*;

public class Prob05 {

	static String file = "Prob05";
	static Scanner in;
	static PrintWriter out;
	static int t;
	static ArrayList<String> a, b;
	public static void main(String[] args)throws IOException{		
		

		
		in = new Scanner(System.in);
		t = in.nextInt(); in.nextLine();
		
		while(t-->0) {
			init();
			solve();
		}
		
		in.close();		
				
	}
	static void solve() {
		Collections.sort(a);
		Collections.sort(b);

		String last = "";
		String both ="";
		String now = "";
		
		for(String s:a) {
			if(b.contains(s)) {
				both += s +",";
				b.remove(s);
			}
			else last += s+",";
		}
		
		for(String s:b)	now+=s+",";
		
		
		System.out.println(last.substring(0, last.length()-1));
		System.out.println(both.substring(0, both.length()-1));
		System.out.println(now.substring(0, now.length()-1));

	}
	static void init() {
		a = new ArrayList<String>();
		b = new ArrayList<String>();

		String[] temp = in.nextLine().split(",");			
		for(int j=0; j<temp.length; j++) a.add(temp[j]);
			
		temp = in.nextLine().split(",");			
		for(int j=0; j<temp.length; j++) b.add(temp[j]);			
	}
}