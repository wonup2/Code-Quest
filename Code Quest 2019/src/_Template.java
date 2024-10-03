import java.util.*;
import java.io.*;

public class _Template {

    static String file = "Prob08";      //local    
    static PrintWriter out;        //local    
    static Scanner in;            
    static int t;
    static String s;
    
    public static void main(String[] args)throws IOException{        
        
        in = new Scanner(new File(file+".in.txt"));            //local
        out = new PrintWriter(new File("out.txt"));        //local        
        //in = new Scanner(System.in);                     //submit
        
        int t = 1;
        
        while(t-->0) {
            init();
            solve();
        }
        
        in.close();   
     
        out.close(); //local        
        Check.check("out.txt", file+".out.txt");    //local
    }
    
    
    static void init() {           
      
    }
    
    static void solve() {
int N = Integer.parseInt(in.nextLine());
		
		for(int n= 1; n <=N; n++) {
			int row = in.nextInt();
			int col = in.nextInt();
			
			//row row-2 = 25; row row-1 50
			//col 
			
			
			for(int i= 0; i < 20; i++) {
				String line = "";
				for (int j = 0; j <20; j++) {
					
					if(i == row && j == col) line += "100 ";
					else if ((i == row-2 || j == col-2) || (i == row+2 || j == col +2)) {
						line += "50 ";
					}
					else if ((i == row-1 || j == col-1)|| (i == row+1 || j == col +1)) {
						line += "25 ";
					}
					else line += "10 ";
				}
				
				out.println(line.trim());
			}
			
		}
    }
    
    
    class mine implements Comparable<mine>{
    	String name;
    	int score;
    	
    	mine(String n, int s){
    		name = n;
    		score = s;
    	}

    	@Override
    	public int compareTo(mine o) {		
    		if(this.score >= o.score) return 1;   //1: ascending  -1: descending
    		else return -1;		
    	}
    }

}
 
