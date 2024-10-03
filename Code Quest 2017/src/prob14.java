import java.util.*;
import java.io.*;

public class prob14 {
	static String file = "Prob14";

	static BufferedReader in;
	static PrintWriter out;
	static TreeMap<String, TreeSet<String>> directory;
	
	public static void main(String[] args) throws Exception {
		
		out = new PrintWriter(new File("out.txt"));		
		in = new BufferedReader(new FileReader(file+".in"));
		directory = new TreeMap<>();
		
		int n = Integer.parseInt(in.readLine());
		
		for(int i = 0; i <n; i ++) {
			String[] next = in.readLine().split(",");
			if(!directory.containsKey(next[1]))
				directory.put(next[1], new TreeSet<>());
			directory.get(next[1]).add(next[0]);
		}
		
		System.out.println(directory);
		
		for(String i: directory.get("None"))
			recurse(0, i);
		
		out.close();
		Check.check("out.txt", file+".out");

	}
	
	public static void recurse(int index, String word) {
		
		for(int i = 0; i < index; i ++)
			out.print("-");
		
		out.println(word);
		
		if(directory.containsKey(word)) {
			
			for(String i: directory.get(word)) 
				recurse(index + 1, i);
			
		}
	}

}