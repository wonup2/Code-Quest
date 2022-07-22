import java.util.*;
import java.io.*;

public class Joseph_Prob08 {

    static String file = "Prob08";
    static Scanner in;
    static PrintWriter out;
    static double distance, mph;
    static int n;
    
    
    public static void main(String[] args)throws IOException{
        in = new Scanner(new File(file+".in.txt"));
//        in = new Scanner(System.in);
        
        out = new PrintWriter(new File("out.txt"));
        
        n = in.nextInt(); in.nextLine();
        
        while(n-->0) {
            init();
            solve();
        }
                        
        in.close();out.close();
		Check.check("out.txt", file+".out.txt");
    }
    
    static void init() {
        distance = in.nextDouble() * 1000000;
        mph = in.nextDouble();
              
        long seconds = Math.round(distance / mph *60 *60);
     
        long days = seconds / 24 / 60 / 60;
        seconds -= (days * 24 * 60 * 60);
        
        long hours = seconds / 60 / 60;
        seconds -= (hours * 60 * 60);
        
        long minutes = seconds / 60;
        seconds -= (minutes * 60);
        
        
     

        System.out.println("Time to Mars: " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
    
    /*
    3480000
Time to Mars: 40 days, 6 hours, 40 minutes, 0 seconds
24999931
Time to Mars: 289 days, 8 hours, 25 minutes, 31 seconds
22978723
Time to Mars: 265 days, 22 hours, 58 minutes, 43 seconds
     */
    static void solve() {
        
    }
}