import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(new File("input1.txt"));
		PrintWriter b = new PrintWriter(new File("output1.txt"));
		int n = a.nextInt(); a.nextLine();
		
		String line = "";

		int i=1;
		while(n-->0) {
			line=a.nextLine();
			
			line = line.replace(",","");
			
			b.println(line);
		}
		
		a.close();
		b.close();
	}

}
