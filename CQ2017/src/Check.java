import java.io.*;
import java.util.*;

public class Check {

	public static void check(String s1, String s2) throws IOException {

    	Scanner mine = new Scanner(new File(s1));
    	Scanner correct = new Scanner(new File(s2));
    	int line = 0;
    	int wrong = 0;
    	boolean empty = false;
    	
		while(mine.hasNextLine()&&correct.hasNextLine()){
			empty = true;
			line++;
			String a = mine.nextLine();
			String b = correct.nextLine();
			if(!a.equals(b))
			{
				System.out.println("Wrong: " + line);
				wrong++;
			}
		}	
		
		if(!empty) System.out.println("No result in out.txt");
		else if(wrong==0) System.out.println("OK!");
		
		mine.close();
		correct.close();
	}
}