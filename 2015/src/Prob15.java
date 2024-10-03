import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Prob15{
	static String file = "Prob15";
	static Scanner in;
    static PrintWriter out;

	static int t, n;
	static Stack<String> o;
	static String s, op="^*/+-";
	
	public static void main(String[] args) throws IOException {
		
		in = new Scanner(new File(file+".in.txt"));
        out = new PrintWriter(new File("out.txt"));
		
		t = in.nextInt();
		while(t-->0) {
			n = in.nextInt(); in.nextLine();
			while(n-->0) solve();
		}	
		in.close();out.close();
		Check.check(file+".out.txt");
	}
	
	static void solve() {
		s = in.nextLine().replace(" ","");
		o = new Stack<String>();
		String ans = "";
		
		for(int i=0; i<s.length(); i++) {
			String cur = s.substring(i, i+1);
						
			if(cur.equals("(")) {
				o.add("("); 
				continue;
			}
			
			if(cur.equals(")")) {
				while(!o.isEmpty()&&!o.peek().equals("(")) 
					ans+=o.pop()+" ";
				o.pop(); //pop "("
				continue;
			}
			
			if(op.contains(cur)) {
				String op1 = cur;
				String op2 = o.isEmpty()? "":o.peek(); 
				
				if(op1.equals("^")&&op2.equals("^")) {
					o.add(op1);		
					continue;
				}

				if(conv(op1) > conv(op2)) o.add(op1);				
				else {
					
					while(!o.isEmpty()&&conv(op1) <= conv(o.peek())) 
						ans+=o.pop()+" ";
					
					o.add(op1);		
				}
			}
			else ans+= cur+" ";			
		}
		
		while(!o.isEmpty()) 
			ans+=o.pop()+" ";
		
		out.println(ans.trim());
	}
	
	static int conv(String s) {
		if(s.equals("")) return 4;
		else if(s.equals("^")) return 3;
		else if(s.equals("*") || s.equals("/"))return 2;
		else if(s.equals("+") || s.equals("-"))return 1;
		else return 0;
	}
}