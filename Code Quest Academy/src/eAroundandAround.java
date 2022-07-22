import java.util.*;

public class eAroundandAround{
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
    	
    	double num = in.nextInt();
        double r = 40075 / Math.PI / 2 + num;
        num = Math.PI * 2 * r;
        System.out.printf("%.1f\n", num);        
    }
    static void solve() {
        
    }
}