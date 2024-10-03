import java.util.*;
import java.io.*;

public class Prob03 {

	static String file = "Prob04";
	
	public static void main(String[] args)throws IOException{
		Scanner in = new Scanner(new File(file+".in.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		String result="";
		 int T = Integer.parseInt(in.nextLine());
	        for (int z = 0; z < T; z++) {
	            String[] input = in.nextLine().split(" ");
	            Set <String> check = new HashSet <String>();
	            int[] count = new int[3];
	            for (int i = 0; i < input.length; i++) {
	                check.add(input[i]);
	                if (input[i].equals("R")) {
	                    count[0]++;
	                }
	                else if (input[i].equals("P")) {
	                    count[1]++;
	                }
	                else {
	                    count[2]++;
	                }
	            }
	            if (check.size() == 3 || check.size() <= 1) {
	            	result+="NO WINNER\n";
	            }
	            else if (check.contains("R") && check.contains("P") && count[1] == 1) {
	            	result+=("PAPER\n");
	            }
	            else if (check.contains("R") && check.contains("S") && count[0] == 1) {
	            	result+=("ROCK\n");
	            }
	            else if (check.contains("S") && check.contains("P") && count[2] == 1) {
	            	result+=("SCISSORS\n");
	            }
	            else {
	            	result+=("NO WINNER\n");
	            }
	        }
	        
	        
		
		out.print(result);
		in.close();
		out.close();
		Check.check(file+".out.txt");
	}
}