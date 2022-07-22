import java.util.*;

public class eDataLockdown {
	static Scanner in;
	static int n, t, data;
	static String url;
	public static void main(String[] args) {

		in = new Scanner (System.in);
		t = in.nextInt(); in.nextLine();
		while(t-->0) {
			init();
		}			
	}
	
	static void init() {
		
		n=in.nextInt(); in.nextLine();

		while(n-->0) {
			url = in.next();
			data = in.nextInt();
			
			if(url.endsWith(".lmco.com") || data <1000) continue;
			
			System.out.println(url+" "+data);
		}
		
	}
	static void solve() {
		
	}
}
