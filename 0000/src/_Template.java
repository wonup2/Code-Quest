import java.util.*;
import java.io.*;

public class _Template {

    static String file = "2";      //local    
    static PrintWriter out;        //local    
    static Scanner in;            
    static int t;
    static String s;
    
    public static void main(String[] args)throws IOException{        
        
        in = new Scanner(new File(file+".in"));            //local
        out = new PrintWriter(new File("out.txt"));        //local        
        //in = new Scanner(System.in);                     //submit
        
        int t = in.nextInt(); in.nextLine();
        
        while(t-->0) {
            init();
            solve();
        }
        
        in.close();   
     
        out.close(); //local        
        Check.check("out.txt", file+".out");    //local
    }
    
    
    static void init() {           
        s = in.nextLine();
    }
    
    static void solve() {
        out.println(s);    //local 
        //System.out.println(s);   //submit
    }
    
    
    class mine implements Comparable<mine>{
    	String name;
    	int score;
    	
    	mine(String n, int s){
    		name = n;
    		score = s;
    	}

    	@Override
    	public int compareTo(mine o) {		
    		if(this.score >= o.score) return 1;   //1: ascending  -1: descending
    		else return -1;		
    	}
    }

}
 
