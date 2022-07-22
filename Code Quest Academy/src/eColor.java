import java.util.*;

public class eColor {
	static Scanner in;
	static int n;
	static String color;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		
		while(n-->0) {			
			solve();
		}			
	}
	
	static void solve() {
		color = in.next();
		
		if(color.equals("blue")||color.equals("red")||color.equals("yellow"))
			System.out.printf("No colors need to be mixed to make %s.\n",color);
		
		else {
			String mix="red and yellow";
			
			if(color.contains("violet")) mix="blue and red";
			else if(color.contains("green")) mix="blue and yellow";
						
			System.out.printf("In order to make %s, %s must be mixed.\n", color, mix);
		}			
	}
}

/*
4
violet
blue-green
yellow
orange

*/