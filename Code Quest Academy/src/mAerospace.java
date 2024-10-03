import java.util.*;

public class mAerospace {
	static Scanner in;
	static int t, n;
	static LinkedList<data> list;
	public static void main(String[] args) {

		in = new Scanner (System.in);
		t = in.nextInt(); in.nextLine();
		while(t-->0) {
			init();
			solve();		
		}			
	}
	
	static void init() {
		n=in.nextInt(); in.nextLine();

		list = new LinkedList<data>();

		while(n-->0) {
			String s = in.nextLine();
			String name = s.substring(0, s.indexOf('_'));
			char cl = s.charAt(s.indexOf('_')+1);
			int x = Integer.parseInt(s.substring(s.indexOf(':')+1,s.indexOf(',')));
			int y = Integer.parseInt(s.substring(s.indexOf(',')+1));
			list.add(new data(name, cl, x, y));
		}
	}
	
	static void solve() {
		
		while(!list.isEmpty()) {			
			Collections.sort(list);			
			list.remove(0).destroy();			
			for(data d:list) d.move();			
		}
	}
	
	static class data implements Comparable<data>{
		String name; char c; int x, y;
		
		data(String m, char cl, int a, int b){
			name = m; c = cl; x = a; y = b;
		}

		void move() {
			if(c=='A') x-=10;
			else if(c=='B') x-=20;
			else x-=30;
		}
		
		public void destroy() {
			System.out.println("Destroyed Ship: "+name+" xLoc: "+x);
		}
		
		public String toString() {
			return name+" "+c+" "+x+" "+y;
		}
		@Override
		public int compareTo(data o) {
			if(this.x==o.x) return o.y-this.y;			
			return this.x-o.x;
		}	
	}
}
/*
2
3
DOOM_A:123,1444
TEST_B:12,145
BOGEE_C:52,345
13
SHIP1_A:150,150
SHIP2_B:200,150
SHIP3_C:165,130
SHIP4_A:205,135
SHIP5_B:155,105
SHIP6_C:195,120
SHIP7_A:140,50
SHIP8_B:175,70
SHIP9_C:215,70
SHIP10_A:145,10
SHIP11_B:160,30
SHIP12_C:185,35
SHIP13_C:225,20

*/