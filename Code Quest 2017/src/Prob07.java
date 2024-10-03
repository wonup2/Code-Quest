import java.util.*;
import java.io.*;

public class Prob07 {

    static String file = "Prob07";    //local    
    static PrintWriter out;        //local    
    static Scanner in;            
    static int t, n;
    
    public static void main(String[] args)throws IOException{        
        
        in = new Scanner(new File(file+".in"));            //local
        out = new PrintWriter(new File("out.txt"));        //local        
        //in = new Scanner(System.in);                    //submit
        
        int t = in.nextInt(); in.nextLine();
        
        while(t-->0) {
            init();
            solve();
        }
        
        in.close();        
        //out.close(); //local
        
        //Check.check("out.txt", file+".out");    //local
    }
    
    
    static void init() {        
 
    }
    
    static void solve() {
    	String[] arr2 = in.nextLine().split(":");
		String name = arr2[0];
		String bats = arr2[1];
		if (bats == ""){
			out.printf("%s=0.000\n", name);
		}
		String[] arr = bats.split(",");
		double atBatsCount = 0; 
		double total = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j].equals("BB")) {
				atBatsCount--; 
			}
			else if (arr[j].equals("K")) {
				
			}
			else if (arr[j].equals("1B")) {
				total += 1;
			}
			else if (arr[j].equals("2B")) {
				total += 2;
			}
			else if (arr[j].equals("3B")) {
				total += 3;
			}
			else if (arr[j].equals("HR")) {
				total += 4;
			}
			atBatsCount++;
		}
		double slugging = total / atBatsCount; 
		slugging *= 1000;
		slugging = Math.round(slugging);
		slugging /= 1000;
		out.printf("%s=%.3f\n", name, slugging);
    }
}