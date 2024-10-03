import java.util.*;
import java.io.*;
import java.math.*;

public class prob12 {
 
    static Scanner in; 
    
    public static void main(String[] args)throws IOException{        
           
        in = new Scanner(System.in);   
        String[] morse = new String[26];
        int N = Integer.parseInt(in.nextLine());
        for(int i = 0;i < 26;i ++) {
        	morse[i] = in.nextLine().substring(2);
        }
        
        
        for(int p = 0;p < N;p ++) {
        String inp1 = in.nextLine();
        String ans1 = "";
        
        for(int i = 0;i < inp1.length();i ++) {
        	String currrent = inp1.substring(i,i+1);
        	if(currrent.equals(" ")) {
        		ans1 += "       ";
        	}else{
        		int ee = (int) currrent.charAt(0);
        		ee -= 65;
        		ans1 += morse[ee];
        		if(i + 1 != inp1.length()) {
        			ans1 += "   ";
        		}
        	}
        }
        System.out.println(ans1);
        
        	
        String[] inp = in.nextLine().split("   ");
        for(int i = 0;i < inp.length;i ++) {
        	if(inp[i].length() > 0 && (inp[i].substring(0, 1)).equals(" ")) {
        		inp[i] = inp[i].substring(1);
        	}
        }
        
        String ans = "";
        for(int i = 0;i < inp.length;i ++) {
        	for(int j = 0;j < 26;j ++) {
        		if(inp[i].length() == 0) {
        			ans += " ";
        			break;
        		}else if(inp[i].equals(morse[j])) {
        			ans += (char) (j+65);
        			break;
        		}
        	}
        }
        
        System.out.println(ans);
        }
        
      
        
        in.close();        
    }
    
}



