import java.util.*;

public class mdividebyzero{
    static Scanner in;
    static int n;
    
    public static void main(String[] args) {

        in = new Scanner (System.in);
        n = in.nextInt(); in.nextLine();
        while(n-->0) {
            init();
            solve();
        }            
    }
    
    static void init() {
        String a = in.next();
        String b = in.next();
        in.nextLine();
        if(a.charAt(0)>=48&&a.charAt(0)<=57) {
        	
        	if(b.charAt(0)>=48&&b.charAt(0)<=57) {
        		double c = Double.parseDouble(a);
        		double d = Double.parseDouble(b);
        		if(d==0.0){
        			System.out.println("Divide By Zero");
        		}
        		else {
        			System.out.println(c/d);
        		}
        		
        	}
        	else {
        		System.out.println("Invalid Divisor");	
        	}
        }
        else {
        	System.out.println("Invalid Dividend");
        }
        

    }
    static void solve() {
        
    }
}