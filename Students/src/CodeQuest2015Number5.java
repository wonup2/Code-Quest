import java.util.*;
import java.io.*;
public class CodeQuest2015Number5 {
	
	static Scanner in;
	static String country;
	static int N;
	static typeA[] group;
	static typeB[] ans;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("CodeQuest2015Number5.in"));
		init();
		solve();
	}
	
	static String convert(double d) {
		String stars = "";
		long num = Math.round(d / 1000);
		for(int i = 0; i < num; i++)
			stars += "*";
		return stars;
	}
	
	static void init() {
		country = in.nextLine();
		N = Integer.parseInt(in.nextLine());
		group = new typeA[N];

		for(int i = 0; i < N; i++) {
			String[] temp = in.nextLine().split(" ");
			double money = Double.parseDouble(temp[0]);
			int year = Integer.parseInt(temp[1]);
			group[i] = new typeA(money, year);
		}
		Arrays.sort(group);		
	}
	
	static void solve() {
		System.out.println(country + ":");
		for(typeA temp: group)
			System.out.println(temp.year + convert(temp.money));
	}
	
	
	public static class typeA implements Comparable<typeA> {
		double money;
		int year;
		typeA(double a, int b){
			money = a;
			year = b;
		}
		@Override
		public int compareTo(typeA next) {
			// TODO Auto-generated method stub
			return this.year - next.year;
		}
	}
	
	public static class typeB {
		int year;
		String stars;
		typeB(int a, String b){
			year = a;
			stars = b;
		}
		
		public String toString() {
			return year + " " + stars;
		}
	}

}
