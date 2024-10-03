import java.util.*;

public class hWordbyWord {
	static Scanner in;
	static int t, n, range;
	static float ave, med, sum;
	static String mod;
	static ArrayList<pair> a;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		t = in.nextInt(); in.nextLine();
		while(t-->0) {
			init();
			solve();
		}	
	}
	
	static void init() {
		
		n = in.nextInt(); in.nextLine();
		a = new ArrayList<pair>();
		
		for(int i=0; i<n; i++) {
			String temp[] = in.nextLine().replaceAll("[^a-z A-Z]", "").split(" ");
			
			for(int j=0; j<temp.length; j++) 
				a.add(new pair(temp[j].length(), temp[j]));
			
		}		
		ave=0; med=0; range=0; sum=0; mod="";
	}
	
	static void solve() {
		
		Collections.sort(a);
		TreeMap<Integer, Integer> b = new TreeMap<Integer, Integer>();
		
		for(pair p:a) {			
			sum+=p.len;
			if(b.containsKey(p.len)) b.put(p.len, b.get(p.len)+1);
			else b.put(p.len, 1);
		}	
		
		int max = 0;
		for(int v:b.values()) max = Math.max(v, max);
		for(int k:b.keySet()) if(b.get(k)==max) mod+=k+",";
		
		ave = sum/a.size();
		med = a.get(a.size()/2).len;		
		range = b.lastKey()-b.firstKey();
		
		System.out.printf("Average: %.1f\n", ave);		
		System.out.printf("Median: %.1f\n", med);
		System.out.printf("modes: %s\n", mod.substring(0,mod.length()-1));
		System.out.printf("Range: %d\n", range);
		
		int last = b.lastKey();		
		int lenLast = (last+"").length();
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=last; i++) {
			for(int k=0; k<lenLast-(i+"").length(); k++) sb.append(" ");
			if(b.containsKey(i)) {
				sb.append(i).append("|");
				int x = b.get(i);
				for(int j=0; j<x; j++) sb.append("x");
				sb.append("\n");
			}
			else sb.append(i).append("|").append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	static class pair implements Comparable<pair>{

		int len;
		String word;
		
		pair(int x, String y){
			len = x;
			word = y;
		}
		
		public String toString() {
			return len+" "+word;
		}
		
		@Override
		public int compareTo(pair o) {
			return this.len-o.len;
		}
	}
}
