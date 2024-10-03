import java.util.*;
import java.io.*;

public class prob13 {

    static String file = "Prob13";    //local    
    static PrintWriter out;        //local    
    static Scanner in;            
    static int t, n;
    
    public static void main(String[] args)throws IOException{        
        
        //in = new Scanner(new File(file+".in"));            //local
        //out = new PrintWriter(new File("out.txt"));        //local        
        in = new Scanner(System.in);                    //submit
        
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
        double y1 = in.nextDouble(); 
        double y2 = in.nextDouble();
        double y3 = in.nextDouble();
        int qualityLevel = in.nextInt(); in.nextLine();
        //x1 = 0; x2 = 2;
    	double extrapolation1and3 = y1 + (1.5) * (y3 - y1); 
    	//x1 = 1; x2 = 2;
        double extrapolation2and3 = y2 + 2 * (y3 - y2); 
        double max = Math.max(extrapolation1and3, extrapolation2and3);
        
        if (y3 > 9.99) {
        	qualityLevel -= 2; 
        } 
        else if (y1 < 7.77 && y2 < 7.77 && y3 < 7.77) {
        	qualityLevel++;
        }
        else if (y3 > 9.44) {
            if (max > 9.99) {
            	qualityLevel -= 2;
            }
        }
        else {
        	
        }
        if (qualityLevel < 1) {
        	qualityLevel = 1; 
        } else if (qualityLevel > 10) {
        	qualityLevel = 10;
        }
        System.out.println(qualityLevel);
    }
}
