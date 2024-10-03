import java.util.*;
import java.io.*;

public class ProbA {

    //static String file = "2";    //local    
    //static PrintWriter out;      //local    
    static Scanner in;            
    static int t, n;
    static String s;
    
    public static void main(String[] args)throws IOException{        
        
        //in = new Scanner(new File(file+".in"));           //local
        //out = new PrintWriter(new File("out.txt"));       //local        
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
    
        s = in.nextLine();
    }
    
    static void solve() {
        
    	System.out.println(s);
    }
}