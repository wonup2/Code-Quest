import java.util.*;
import java.io.*;
public class codeQuest2015Num5 {
	static Scanner in;
	static PrintWriter out;
	static String team;
	static data[] a;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
			in = new Scanner(new File("Prob05.in"));
			out = new PrintWriter(new File("Prob05.out"));
			int n = in.nextInt();
			for(int i = 0; i < n; i++) {
				init();
				solve();
				in.close();
				out.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void init() throws IOException{
		team = in.next();
		int n = in.nextInt();
		a = new data[n];
		for(int i = 0; i < n; i++) {
			double m = in.nextDouble();
			int y = in.nextInt();
			a[i] = new data(y, m);
		}
		
	}
	
	public static void solve() throws IOException{
		Arrays.sort(a);
		out.println(team + ":");
		for(int i = 0; i < a.length; i++) {
			int money = (int) ((a[i].getMoney() + 500)/1000);
			String s = "";
			for(int j = 0; j < money; j++) {
				s += "*";
			}
			out.println(a[i].getYear() + " " + s);
		}
	}
	static class data implements Comparable<data>{
		int year;
		double money;
		data(int y, double m){
			year = y;
			money = m;
		}
		public int getYear() {
			return year;
		}
		public double getMoney() {
			return money;
		}
		public String toString() {
			return year + " " + money;
		}
		@Override
		public int compareTo(data that) {
			if(this.year < that.year)
				return -1;
			else if(this.year > that.year)
				return 1;
			else {
				if(this.money < that.money)
					return -1;
				else if(this.money > that.money)
					return 1;
				else
					return 0;
			}
		}
		
	}
}
