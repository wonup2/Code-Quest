import java.util.*;

public class eWhosValedictorian {
	
	static Scanner in;
	static int t, n, cr;
	static String name, school;
	static double gpa;
	static report a[];
	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		t = in.nextInt(); in.nextLine();
		
		while(t-- >0) {
			init();
		}
	}
	
	static void init() {
		
		school = in.nextLine();
		n = in.nextInt(); in.nextLine();
		a = new report[n];
		for(int i=0; i<n; i++) {
			String temp[] = in.nextLine().split(":");
			name = temp[0];
		
			String grade[] = temp[1].split(",");
			cr=0;
			gpa=0;
			solve(grade);
			
			a[i] = new report(name, gpa, cr);
		}
		
		Arrays.sort(a);

		System.out.println(school+" = " + a[0].name);
	}
	
	static void solve(String g[]) {
		
		for(int i=0; i<g.length; i++) {
			char c = g[i].charAt(0);
			int num = g[i].charAt(1)-'0';
			cr += num;
			if(c=='A') gpa += 4*num;
			else if(c=='B') gpa+=3*num;
			else if(c=='C') gpa+=2*num;
			else gpa+=num;
		}
		
		gpa/=cr;
	}
	
	static class report implements Comparable<report>{

		String name;
		double gpa;
		int cr;
		
		report(String n, double g, int c){
			name = n;
			gpa = g;
			cr = c;
		}
		
		@Override
		public int compareTo(report o) {

			if(this.gpa==o.gpa) {
				return o.cr-this.cr;
			}
			else if(this.gpa < o.gpa) return 1;
			else return -1;
		}
		
		public String toString() {
			return name+" "+gpa+" "+cr;
		}
	}
}
