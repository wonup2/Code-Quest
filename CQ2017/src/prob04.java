import java.util.*;
import java.io.*;

public class prob04 {

    static String file = "1";      //local    
    static PrintWriter out;        //local    
    static Scanner in;            
    static int t;
    static String s;
    static long f[];
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
    	f = new long[92];
		f[1]=0;
		f[2]=1;
		
		for(int i = 3; i<92; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		
		int n = in.nextInt();
		out.println(n + " = " + f[n]);
    }
    
    static void solve() {

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
 
