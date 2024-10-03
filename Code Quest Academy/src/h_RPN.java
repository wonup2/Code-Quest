import java.util.*;

public class h_RPN{
	static Scanner in;
	static int t, n;
	static Stack<String> p, o;
	static String s, op="(^*/+-";
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		t = in.nextInt();
		while(t-->0) init();
				
	}
	
	static void init() {
		
		n = in.nextInt(); in.nextLine();
		
		while(n-->0) {
			s = in.nextLine().replace(" ","");
			p = new Stack<String>();
			o = new Stack<String>();
			solve();
		}
	}
	
	static void solve() {
		
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
		
		System.out.println(ans);
	}
	
	static int conv(String s) {
		if(s.equals("")) return 4;
		else if(s.equals("^")) return 3;
		else if(s.equals("*") || s.equals("/"))return 2;
		else if(s.equals("+") || s.equals("-"))return 1;
		else return 0;
	}
}