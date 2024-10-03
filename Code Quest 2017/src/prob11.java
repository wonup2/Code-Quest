import java.util.*;
import java.io.*;
public class prob11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("Prob11.in.txt")));
		PrintWriter pw = new PrintWriter(new File("out.txt"));		
        int t = Integer.parseInt(br.readLine()); 
        for(int i = 0; i < t; i++) {
        	String input = br.readLine();
        	String[] arr = input.split(" ");
        	String[] out = new String[arr.length];
        	for(int j = 0; j < arr.length; j++)
        		out[j] = reverse(arr[j]);
        	String output = out[0];
        	for(int j = 1; j < out.length; j++)
        		output += " " + out[j];
        	pw.println(output+1);
        }
        br.close();
        pw.close();
		Check.check("out.txt", "Prob11.out.txt");

	}
	public static String reverse(String s) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length(); i++)
			list.add(s.substring(i,i + 1));
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		ArrayList<Integer> capitalIndex = new ArrayList<Integer>();
		ArrayList<other> otherIndex = new ArrayList<other>();
		for(int i = s.length() - 1; i > -1; i--) {
			String c = s.substring(i, i + 1);
			if(alphabet.indexOf(c) < 0) {
				otherIndex.add(new other(c, i));
				list.remove(i);
			}
			else if(alphabet.indexOf(c) < 26) {
				capitalIndex.add(i);
				list.set(i, c.toLowerCase());
			}
		}
		Collections.reverse(list);
		for(int i = otherIndex.size() - 1; i >= 0; i--)
			list.add(otherIndex.get(i).n, otherIndex.get(i).c);
		for(int i = 0; i < capitalIndex.size(); i++)
			list.set(capitalIndex.get(i), list.get(capitalIndex.get(i)).toUpperCase());
		String result = "";
		for(String s1 : list)
			result += s1;
		return result;
	}
	static class other implements Comparable<other>{
		public String c;
		public int n;
		public int compareTo(other o) {
			return this.n - o.n;
		}
		public other(String character, int index) {
			c = character;
			n = index;
		}
	}
}