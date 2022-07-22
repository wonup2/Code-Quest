import java.util.*;

public class eChinese {
	static Scanner in;
	static int n, year;
	static String[] a= {"Wood", "Fire", "Earth", "Metal", "Water"};
	static String[]b= {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		while(n-->0) {
			init();
			solve();
		}			
	}
	
	static void init() {
		
		year = in.nextInt();

	}
	static void solve() {
		int y1=(year-4)%10/2;
		int y2=(year-4)%12;
		String ans=year+" ";
		if(year%2==0) ans+="Yang ";
		else ans+="Yin ";
		
		ans+=a[y1]+" "+b[y2];
		
		System.out.println(ans);
	}
}

/*
4
1984
2012
2020
2043

1984 Yang Wood Rat
2012 Yang Water Dragon
2020 Yang Metal Rat
2043 Yin Water Pig
*/
