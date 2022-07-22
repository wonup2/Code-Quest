import java.util.*;
import java.io.*;
//import java.text.DecimalFormat;
public class Prob11 {
    static String file = "Prob11";
    static Scanner in;
    static PrintWriter out;
    static int n;
    static String input;
    public static void main(String[] args)throws IOException{
        in = new Scanner(new File(file+".in.txt"));
        //in = new Scanner(System.in);
        out = new PrintWriter(new File("out.txt"));
        n = in.nextInt();in.nextLine();
        
        while(n-->0) {
            init();
            solve();
        }
                        
        in.close();out.close();
        Check.check(file+".out.txt");
    }
    
    static void init() {
        int m = in.nextInt();in.nextLine();
        int max = 0;
        int a = 1;
        for(int i =0; i<m; i++) {
            max+=a;
            a = a*2;
        }
        for(int i =0; i<=max; i++) {
            String tmp = Integer.toBinaryString(i);
            String ans = "";
            if(tmp.length()<m) {
                int b = m-tmp.length();
                for(int j =0; j<b; j++) {
                    ans+="0";
                }
            }
            out.println(ans+=tmp);
        }
        //System.out.println(max);
        //0 0 1 1 2 3 3 7
    }
    
    static void solve() {
        
    }
}