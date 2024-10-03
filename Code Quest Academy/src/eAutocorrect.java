import java.util.*;

public class eAutocorrect {
	static Scanner in;
	static int t, n, m;
	static HashMap<Integer, ArrayList<String>> map;
	
	public static void main(String[] args) {

		in = new Scanner (System.in);
		t = in.nextInt();
		while(t-->0) {
			init();
			solve();
		}
	}
	static void init() {
		n = in.nextInt();
		m = in.nextInt();
		
		map = new HashMap<Integer, ArrayList<String>>();
		
		
		for(int i=0; i<n; i++) {
			String word = in.next();
			int key = word.length();
			if(map.containsKey(key))
				map.get(key).add(word);			
			else {
				map.put(key, new ArrayList<String>());		
				map.get(key).add(word);
			}
		}		
		
		System.out.println(map);
	}
	static void solve() {
		for(int i=0; i<m; i++) {
			String misspelled = in.next();
			int minHD = misspelled.length();
			String ans = "";
						
			for(String s: map.get(misspelled.length())){
				int hd = check(misspelled, s);
				if(hd<=minHD) {
					ans = s;
					minHD=hd;
				}
			}
			
			System.out.println(ans);
		}			
	}
		

	static int check(String a, String b) {
		
		int cnt = 0;
		for(int i=0; i<a.length(); i++)
			if(a.charAt(i)!= b.charAt(i)) cnt++;
		
		return cnt;
	}
}

/*
1
3 5
computer
mouse
program
konpuder
house
compoooo
anagram
oeifeln

*/