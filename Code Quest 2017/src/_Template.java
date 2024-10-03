import java.util.*;
import java.io.*;

public class _Template {

    static String file = "Prob08";    //local    
    static PrintWriter out;      //local    
    static Scanner in;            
    static int t, n;
    
    public static void main(String[] args)throws IOException{        
        
        in = new Scanner(new File(file+".in"));           //local
        out = new PrintWriter(new File("out.txt"));       //local        
        //in = new Scanner(System.in);                    //submit
        
        int t = 1;
        
        while(t-->0) {
            //init();
            solve();
        }
        
        in.close();        
        out.close(); //local
        
        Check.check("out.txt", file+".out");    //local
    }
    
    
    static void init() {        
    
        n = in.nextInt(); in.nextLine();
        
        for(int i=0; i<n; i++) {
            out.println(in.nextLine());        //System.out.println or out.println
        }
    }
    
    static void solve() {
    	int T = Integer.parseInt(in.nextLine());
		
		for(int t = 1; t <= T; t++) {
			double dist = in.nextDouble()*1000000;
			double spd = in.nextDouble();
			
			int time = (int)((dist/spd)*60*60);
			
			int days = (time/60/60/24);
			time -= days*60*60*24;
			
			int hours = time/60/60;
			
			time -= hours*60*60;
			
			int minutes = time/60;
			time -= minutes *60;
			
			int seconds = time;
			
			
			
			
			
			
			out.printf("Time to Mars: %d days, %d hours, %d minutes, %d seconds %n", days, hours, minutes, seconds);
    }
    }
}