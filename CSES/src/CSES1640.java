import java.util.*;

public class CSES1640 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		int n = in.nextInt();
		int x = in.nextInt();
		
		String ans = "IMPOSSIBLE";
		for(int i=1; i<=n; i++) {
			
			int num = in.nextInt();
			int seek = x-num;
			
			if(m.containsKey(seek)) {
				ans = m.get(seek) + " "+ i;
			}
			
			else {
				m.put(num, i);
			}
		}
		
		System.out.println(ans);
	}

}
