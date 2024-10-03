import java.io.File;
import java.io.*;
import java.util.*;

public class Check {
	
	public static void check(String s) throws IOException {

		Scanner judge = new Scanner(new File(s));
		Scanner mine = new Scanner(new File("out.txt"));
		
		int line = 1;
		int wrong = 0;
		while(judge.hasNextLine()) {
			String a = judge.nextLine();
			String b = mine.nextLine();
			
			if(!a.equals(b)) {
				System.out.println(line+": wrong");
				wrong++;
			}
			line++;
		}
		
		if(line==1) System.out.println("Check out.txt");
		else if(wrong==0) System.out.println("OK");
		
		judge.close();
		mine.close();
	}
}
