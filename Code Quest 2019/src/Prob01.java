import java.util.*;
import java.io.*;

public class Prob01 {

	static String file = "Prob01";
	static Scanner in;
	static PrintWriter out;
	
	static int n;
	static String input;
	
	
	public static void main(String[] args)throws IOException{
		in = new Scanner(new File(file+".in.txt"));
		//in = new Scanner(System.in);
		
		out = new PrintWriter(new File("out.txt"));
		
		n = in.nextInt(); in.nextLine();
		
		while(n-->0) {
			init();
			solve();
		}
						
		in.close();out.close();
		Check.check(file+".out.txt");
	}
	
	static void init() {
		input = in.nextLine();
		out.println(input.toLowerCase()+0);		
	}
	
	static void solve() {
		
	}
}