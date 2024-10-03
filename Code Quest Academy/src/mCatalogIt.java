import java.util.*;
import java.io.*;

public class mCatalogIt {

	static BufferedReader in;
	static StringTokenizer st;
	static int t, n;
	static TreeMap<String, TreeSet<String>> map;
	
	public static void main(String[] args) throws IOException {

		in = new BufferedReader(new InputStreamReader(System.in));
		t = 1;		
		for(int i=0; i<t; i++) {
			init();
			solve();
		}		
		in.close();
	}

	static void init() throws IOException{
		
		n = Integer.parseInt(in.readLine());		
		map = new TreeMap<>();		
		for(int i=0; i<n; i++) {
			String t[] = in.readLine().split(",");			
			if(!map.containsKey(t[1])) map.put(t[1], new TreeSet<String>());			
			map.get(t[1]).add(t[0]);	
		}	
	}
	
	static void solve() throws IOException{		
		
		for(String c:map.get("None")) {
			print(c, 0);
		}		
	}
	
	static void print(String p, int d) {
		
		for(int i=0; i<d; i++) System.out.print("-");	
		if(map.containsKey(p)) {			
			for(String c: map.get(p)) {
				print(c, d+1);
			}
		}
	}
	
	static class data implements Comparable<data>{

		int a;
		int b;
		
		data(int x, int y){
			a = x;
			b = y;
		}
		
		@Override
		public int compareTo(data o) {
			
			return this.a - o.a;
		}
	}
}
