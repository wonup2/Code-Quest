import java.util.*;
import java.io.*;


public class prob02 {

    static String file = "Prob02";    //local    
    static PrintWriter out;        //local    
    static Scanner in;            
    static int t, n;
    
    public static void main(String[] args)throws IOException{        
        
       
        in = new Scanner(System.in);                    //submit
        
        int t = 1;
        
        while(t-->0) {
            init();
            solve();
        }
        
        in.close();        
 
    }
    
    
    static void init() {        
    	
    	
    	
    	String s = in.nextLine();
    	String answer = "";
    	for(int i = 0; i < s.length(); i++) {
    		
    		char ch = s.charAt(i);
    		if(65 <= s.charAt(i) && s.charAt(i) <= 90) {
    			 ch += 32;
    			 answer += ch;
    		}
    		else {
    			answer += ch;
    		}
    	}
    	System.out.println(answer);
    }
    
    static void solve() {
        
    }
}