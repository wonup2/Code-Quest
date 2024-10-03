import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Prob12 {
	static String file = "Prob12";

	static BufferedReader in;
	static PrintWriter out;
	static int n;
	static double sum, totalSum;
	
	public static void main(String[] args) throws Exception {
		

		out = new PrintWriter(new File("out.txt"));		
		in = new BufferedReader(new FileReader(file+".in.txt"));
		int t = Integer.parseInt(in.readLine());
		for(int i = 0; i < t; i ++) {
			init();
			solve();
		}
		
		out.close();
		Check.check("out.txt", file+".out.txt");
	}
	
	public static void init() throws Exception {
		
		n = Integer.parseInt(in.readLine());
		sum = 0;
		totalSum = 0;
		for(int i = 0; i < n; i ++) {
			String l = in.readLine().replaceAll(",", ", ");
			//System.out.println(l);
			String[] line = l.split(",");
			//System.out.println(Arrays.toString(line));
			if(!line[1].equals(" ")) {
				sum += Double.parseDouble(line[1]);
			}
			if(!line[2].equals(" ")) {
				sum -= Double.parseDouble(line[2]);
			}
			totalSum += sum; 
		}
//		System.out.println(totalSum);
	}
	
	public static void solve() throws Exception {
		
		double ad = (double)totalSum / n;
		double ip = 0.18 / 12;
		DecimalFormat df = new DecimalFormat("$0.00");
		out.println(df.format(ad * ip));
		
		

		
	}

}