import java.util.*;
import java.io.*;

public class Prob01 {

	static String file = "Prob01";
	public static void main(String[] args)throws IOException{
		Scanner in = new Scanner(new File(file+".in.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		
		int n = in.nextInt(); 
		for(int i=0; i<n; i++){

		}
		
		in.close();out.close();
		Check.check("out.txt", file+".out.txt");

	}
}