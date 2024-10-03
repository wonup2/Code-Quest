import java.util.*;
import java.io.*;

public class Self_Check_Template {

	static String file = "Prob01";
	static Scanner in;
	static PrintWriter out;
	static int t, n;
	
	public static void main(String[] args)throws IOException{		
		
		in = new Scanner(new File(file+".in.txt"));
		out = new PrintWriter(new File("out.txt"));				
		//in = new Scanner(System.in);
		
		int t = in.nextInt(); in.nextLine();
		
		while(t-->0) {
			init();
			solve();
		}
		
		in.close();		
		out.close();		
		
		Check.check("out.txt", file+".out.txt");
	}
	
	static void init() {		
	
	}
	
	static void solve() {
		
	}
}