import java.io.*;
import java.util.*;

public class eBiggerisBetter {
	static BufferedReader in;
	static StringTokenizer st;
	static int n;
	static ArrayList<Integer> a;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		in = new BufferedReader(new InputStreamReader (System.in));
		n = Integer.parseInt(in.readLine());
		while(n-->0) solve();
	}
	static void solve() throws IOException {
		a = new ArrayList<Integer>();
		st = new StringTokenizer(in.readLine());
		while(st.hasMoreTokens())
			a.add(Integer.parseInt(st.nextToken()));
		
		Collections.sort(a);
		System.out.println(a.get(a.size()-1));

	}

}
