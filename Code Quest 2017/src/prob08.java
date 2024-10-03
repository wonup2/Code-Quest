import java.util.*;
import java.io.*;

public class prob08 {

    static Scanner in;            
    static int t, n, days, hours, minutes, seconds;
    static double d, v, time;
    
    
    public static void main(String[] args)throws IOException{        
        
  
    	in = new Scanner(System.in);                    
        
        int t = in.nextInt(); in.nextLine();
        
        while(t-->0) {
            init();
            solve();
        }
        
        in.close();                
    }
    
    
    static void init() {        
    	d = in.nextDouble();
    	v = in.nextDouble();
    	
      
    }
    
    static void solve() {
        time = (d*1000000)/v;
       
        days = (int) (time/24);
        
        
        hours = (int) (time%24);
        minutes = (int) ((time*60)%60);
        //System.out.println(Math.round(time*3600)%60);
        seconds = (int) Math.round((time*3600)%60);
        
        System.out.println("Time to Mars: " + days + " days, " + hours + " hours, "+ minutes+ " minutes, "+ seconds +" seconds");

        
    }
}

//3
//34.8 36000
//250 36000.1
//150 23500
