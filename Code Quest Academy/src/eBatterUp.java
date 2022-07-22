import java.util.*;

public class eBatterUp {
	static Scanner in;
	static int n, top, bottom;
	static String input[], bats[], name;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		while(n-->0) {
			init();
			solve();
		}			
	}
	
	static void init() {
		
		input = in.nextLine().split(":");
		bats = input[1].split(",");
		name = input[0];
		
		//System.out.println(name);
		//System.out.println(Arrays.toString(bats));

	}
	static void solve() {
		top = 0;
		bottom = 0;
		for(int i=0; i<bats.length; i++) {
			char c = bats[i].charAt(0);
			
			if(c=='K') bottom++;
			else if(c=='H') {
				bottom++;
				top += 4;
			}
			else if(c=='1') {
				bottom++;
				top += 1;
			}
			else if(c=='2') {
				bottom++;
				top += 2;
			}
			else if(c=='3') {
				bottom++;
				top += 3;
			}			
		}
		
		if(bottom==0) System.out.printf("%s=%.3f\n", name, 0.0);
		else {
			double ans = top/(double)bottom;
			System.out.printf("%s=%.3f\n", name, ans);
		}
	}
}

/*
4
Moreland:K,2B,1B,HR
Andrus:BB,BB,2B,K
Chirinos:1B,1B,3B
Odor:1B,K,3B

*/