import java.util.*;
import java.io.*;

public class Prob10 {

	static String file = "Prob10";
	static Scanner in;
	static PrintWriter out;
	
	static int n, lines;
	static boolean capsLock;
	
	public static void main(String[] args)throws IOException{
		in = new Scanner(new File(file+".in.txt"));
		//in = new Scanner(System.in);
		
		out = new PrintWriter(new File("out.txt"));
		
		n = in.nextInt(); in.nextLine();
		
		while(n-->0) {
			init();
			solve();
		}
						
		in.close();out.close();
		Check.check("out.txt", file+".out.txt");
	}
	
	static void init() {
		lines = in.nextInt(); in.nextLine();
	}
	
	static void solve() {
		for (int i = 0; i < lines; i ++)
		{
			boolean capsLock = false;
			String line = in.nextLine();
			for (int j = 0; j < line.length(); j++)
			{
				out.print(convert(line.charAt(j)));
			}
			out.println();
		}
	}
	
	static String convert(char c)
	{
		if (String.valueOf(c).equalsIgnoreCase("a"))
		{
			capsLock = !capsLock;
		}
		else if (String.valueOf(c).equalsIgnoreCase("b"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "v";
				else return "V";
			}
			else
			{
				if (capsLock) return "V";
				else return "v";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("c"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "x";
				else return "X";
			}
			else
			{
				if (capsLock) return "X";
				else return "x";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("d"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "s";
				else return "S";
			}
			else
			{
				if (capsLock) return "S";
				else return "s";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("e"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "w";
				else return "W";
			}
			else
			{
				if (capsLock) return "W";
				else return "w";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("f"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "d";
				else return "D";
			}
			else
			{
				if (capsLock) return "D";
				else return "d";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("g"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "f";
				else return "F";
			}
			else
			{
				if (capsLock) return "F";
				else return "f";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("h"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "g";
				else return "G";
			}
			else
			{
				if (capsLock) return "G";
				else return "g";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("i"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "u";
				else return "U";
			}
			else
			{
				if (capsLock) return "U";
				else return "u";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("j"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "h";
				else return "H";
			}
			else
			{
				if (capsLock) return "H";
				else return "h";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("k"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "j";
				else return "J";
			}
			else
			{
				if (capsLock) return "J";
				else return "j";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("l"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "k";
				else return "K";
			}
			else
			{
				if (capsLock) return "K";
				else return "k";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("m"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "n";
				else return "N";
			}
			else
			{
				if (capsLock) return "N";
				else return "n";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("n"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "b";
				else return "B";
			}
			else
			{
				if (capsLock) return "B";
				else return "b";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("o"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "i";
				else return "I";
			}
			else
			{
				if (capsLock) return "I";
				else return "i";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("p"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "o";
				else return "O";
			}
			else
			{
				if (capsLock) return "O";
				else return "o";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("q"))
		{
			return "    ";
		}
		else if (String.valueOf(c).equalsIgnoreCase("r"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "e";
				else return "E";
			}
			else
			{
				if (capsLock) return "E";
				else return "e";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("s"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "a";
				else return "A";
			}
			else
			{
				if (capsLock) return "A";
				else return "a";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("t"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "r";
				else return "R";
			}
			else
			{
				if (capsLock) return "R";
				else return "r";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("u"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "y";
				else return "Y";
			}
			else
			{
				if (capsLock) return "Y";
				else return "y";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("v"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "c";
				else return "C";
			}
			else
			{
				if (capsLock) return "C";
				else return "c";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("w"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "q";
				else return "Q";
			}
			else
			{
				if (capsLock) return "Q";
				else return "q";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("x"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "z";
				else return "Z";
			}
			else
			{
				if (capsLock) return "Z";
				else return "z";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("y"))
		{
			if (Character.isUpperCase(c))
			{
				if (capsLock) return "t";
				else return "T";
			}
			else
			{
				if (capsLock) return "T";
				else return "t";
			}
		}
		else if (String.valueOf(c).equalsIgnoreCase("z"))
		{
			
		}
		else if (c == '.')
		{
			return ",";
		}
		else if (c == ',')
		{
			return "m";
		}
		else if (c == ' ')
		{
			return " ";
		}
		return "";
	}
}