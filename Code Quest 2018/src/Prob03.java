import java.util.*;
import java.io.*;

public class Prob03 {

	static String file = "Prob03";
	
	public static void main(String[] args)throws IOException{
		Scanner in = new Scanner(new File(file+".in.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		
		int n = in.nextInt(); 
		String result = "";
		for(int i=0; i<n; i++){
			String num = in.next().replace("th", "");
			int last=num.length()-1;
			
			if(num.length()>1 && num.charAt(last-1)=='1') result += num+"th\n";	 			 
			else {
				if(num.charAt(last)=='1') result += num+"st\n";
				else if(num.charAt(last)=='2')	result += num+"nd\n";
				else if(num.charAt(last)=='3')	result += num+"rd\n";
				else result += num+"th\n";
			}
		}		
		
		out.print(result);
		in.close();out.close();
		Check.check(file+".out.txt");
	}
}