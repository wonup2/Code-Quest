import java.util.*;

public class eCaughtSpeeding {
	static Scanner in;
	static int n, speed;
	static boolean birthday;
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		while(n-->0) {
			init();
			solve();
		}			
	}
	
	static void init() {
		
		speed = in.nextInt();
		birthday = in.nextBoolean();

	}
	static void solve() {
		
		if(birthday) {
			if(speed<=65) System.out.println("no ticket");
			else if(speed<=85)System.out.println("small ticket");
			else System.out.println("big ticket");
		}
		else {
			if(speed<=60) System.out.println("no ticket");
			else if(speed<=80)System.out.println("small ticket");
			else System.out.println("big ticket");
		}
	}
}

/*
3
60 false
82 false
83 true

*/