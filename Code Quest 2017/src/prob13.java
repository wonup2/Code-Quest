import java.util.*;
import java.io.*;
public class prob13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("Prob13.in.txt")));
        PrintWriter pw = new PrintWriter(new File("out.txt"));
        int t = Integer.parseInt(br.readLine());
        double low = 7.7777777777778;
        double extra = 9.444444444;
        double high = 10.0;
        for(int i = 0; i < t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double t1 = Double.parseDouble(st.nextToken());
        	double t2 = Double.parseDouble(st.nextToken());
        	double t3 = Double.parseDouble(st.nextToken());
        	int q = Integer.parseInt(st.nextToken());
    		
        	if(t3 > high)
        		q -= 2;
        	else if(t3 > extra) {
        		double extra02 = t1 + 1.5 * (t3 - t1);
        		double extra12 = t2 + 2.0 * (t3 - t2);
        		if(Math.max(extra02, extra12) > high)
        			q -= 2;
        	}
        	else if(t1 < low && t2 < low && t3 < low)
        		q += 1;
        	if(q > 10)
        		q = 10;
        	else if(q < 1)
        		q = 1;
        	pw.println(q);
        }
        br.close();
        pw.close();
		Check.check("out.txt", "Prob13.out.txt");
	}
}