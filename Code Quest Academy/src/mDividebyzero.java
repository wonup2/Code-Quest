import java.util.*;

public class mDividebyzero {
	static Scanner in;
	static int t;
	static String s1, s2;
	static double d1, d2;
	
	public static void main(String[] args)  {
		
		in = new Scanner(System.in);

		t = in.nextInt();
		for(int i = 0; i < t; i++) {
			s1 = in.next();
			
			if(valid(s1)) {
				String s2 = in.next();
				
				if(valid(s2)) {
					
					d1 = Double.parseDouble(s1);
					d2 = Double.parseDouble(s2);
					
					if(d2 == 0.0)System.out.println("Divide By Zero");
					else System.out.printf("%.1f\n", (d1 / d2));
					
				}
				
				else System.out.println("Invalid Divisor");
			}
			
			else {
				in.next();
				System.out.println("Invalid Dividend");
			}
		}
		
		in.close();
	}
	public static boolean valid(String s) {
		
		String digits = "0123456789";
		boolean seenDot = false;
		
		for(int i = 0; i < s.length(); i++) {
			if(i != 0 && s.charAt(i) == '-') return false;
			else if(i == 0 && s.charAt(i) == '-') continue;
			else if(seenDot && s.charAt(i) == '.') return false;
			else if(!seenDot && s.charAt(i) == '.')	seenDot = true;
			else if(!digits.contains(s.substring(i, i + 1))) return false;
		}
		return true;
	}
}