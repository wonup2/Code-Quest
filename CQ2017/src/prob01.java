import java.util.*;
import java.io.*;

public class prob01 {

    static Scanner in;            
    static int t, n;
    static String s;
    
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
    	s = in.nextLine();
    }
    
    static void solve() {
        System.out.println(s);
        System.out.println(s);
    }
}