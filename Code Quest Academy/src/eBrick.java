import java.util.*;

public class eBrick {
	static Scanner in;
	static int n, small, big, goal;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		while(n-->0) {
			init();
			System.out.println(solve());
		}			
	}
	
	static void init() {
		small = in.nextInt();
		big = in.nextInt();
		goal = in.nextInt();
		
	}
	static boolean solve() {
		if(small + big * 5 < goal) return false;
		
		int needSmall = 0;
		int useBig = big*5;
		if(goal <= useBig) needSmall = goal%5;
		else needSmall = goal - useBig; 
		
		return needSmall<=small;
	}
}

/*
3
3 1 8
3 1 9
3 2 10

*/