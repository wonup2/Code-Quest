import java.util.*;

public class eAntiAsteroidWeapon{
    static Scanner in;
    static int n;
    static TreeMap<Double, String> map;
    
    public static void main(String[] args) {

        in = new Scanner (System.in);
        n = in.nextInt(); in.nextLine();
        while(n-->0) {
            init();
        }            
    }
    
    static void init() {
    	
    	int m = in.nextInt();in.nextLine();
    	map = new TreeMap<Double, String>();

    	while(m-->0) solve();
        for(String s: map.values()) System.out.println(s);

        
    }
    static void solve() {
        String line = in.nextLine();
        String tmp[] = line.split(" ");
            
        int a = Integer.parseInt(tmp[0]);
        int b = Integer.parseInt(tmp[1]);
        double d = a*a + b*b;

        map.put(d, line);
    }
}

/*
2
3
2 1
1 1
5 5
4
2 2
1 7
-1 0
1 1

*/