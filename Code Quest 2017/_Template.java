import java.util.*;
import java.io.*;

public class _Template {

    static String file = "2";    //local    
    static PrintWriter out;      //local    
    static Scanner in;            
    static int t, n;
    
    public static void main(String[] args)throws IOException{        
        
        in = new Scanner(new File(file+".in"));           //local
        out = new PrintWriter(new File("out.txt"));       //local        
        //in = new Scanner(System.in);                    //submit
        
        int t = 1;
        
        while(t-->0) {
            init();
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
        
    }
}