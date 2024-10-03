import java.util.*;
import java.io.*;

public class ProbB {

    static String file = "1";	//local
    static PrintWriter out;		//local
    
    static Scanner in;			
    static int t, n;
    static double a,b;
    
    public static void main(String[] args)throws IOException{        
        
        in = new Scanner(new File(file+".in"));			//local
        out = new PrintWriter(new File("out.txt"));     //local          
        //in = new Scanner(System.in);	//submit
        
        int t = in.nextInt(); in.nextLine();        
        while(t-->0) {
            init();
            solve();
        }        
        in.close();  
        
        out.close();     						//local           
        Check.check("out.txt", file+".out"); 	//local
    }
    
    static void init() {        
        String s [] = in.nextLine().split(":");        
        a = Double.parseDouble(s[0]);
        b = Double.parseDouble(s[1]);        
    }
    
    static void solve() {
 
        if (b/a <=1) out.println("SWERVE");
        else if (b/a<=5) out.println("BRAKE");
        else out.println("SAFE");  
    }    
}