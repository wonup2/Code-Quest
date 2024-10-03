import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class eAnagram {

    static Scanner in;
    static int n, count;
    static char[] x, y;
    static String[] a;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        n = in.nextInt(); in.nextLine();
        
        for(int i = 0; i<n; i++) {
        	
        	String ori = in.nextLine();
        	
            a = ori.split("\\|");            
            x = a[0].toCharArray();
            y = a[1].toCharArray();

            Arrays.sort(x);
            Arrays.sort(y);
            
            if(a[0].equals(a[1]))ori+= " = NOT AN ANAGRAM"; 
            else if(Arrays.equals(x, y)) ori+=" = ANAGRAM";
            else ori+= " = NOT AN ANAGRAM";
            
            System.out.println(ori);
        }
    }
}
