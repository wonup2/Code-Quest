import java.util.*;

public class eDonorSort {
	static Scanner in;
	static int n;
	static TreeMap<String, Integer> donors;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		n = in.nextInt(); in.nextLine();
		while(n-->0) {
			init();
			//solve();
		}			
	}
	
	static void init() {
		donors = new TreeMap<String, Integer>();

		solve(0);
		solve(2);
		
		String ly="";
		String by="";
		String ty="";
		
		for(String name:donors.keySet()) {
			if(donors.get(name)==0) ly+=name+",";
			else if(donors.get(name)==1) by+=name+",";
			else ty+=name+",";
		}
		
		System.out.println(ly.substring(0,ly.length()-1));
		System.out.println(by.substring(0,by.length()-1));
		System.out.println(ty.substring(0,ty.length()-1));
	}
	
	static void solve(int y) {
		
		String s[] = in.nextLine().split(",");
		
		for(String name:s) {
			if(donors.containsKey(name))
				donors.put(name, 1);
			else donors.put(name, y);
		}
	}
}
