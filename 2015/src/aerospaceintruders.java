import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;



public class aerospaceintruders {

	static String file = "Prob07";
	static Scanner in;
    static PrintWriter out;
	
	public static void main(String[]args) throws Exception {
		in = new Scanner(new File(file+".in.txt"));
        out = new PrintWriter(new File("out.txt"));
        
		//Scanner in = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> type = new ArrayList<>();
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		int z = in.nextInt();
		for (int i = 0; i < z; i++) {
			int n = in.nextInt();
			in.nextLine();
			for (int a = 0; a < n; a++) {
				String temp = in.nextLine();
				name.add(temp.substring(0,temp.indexOf("_")));
				type.add(temp.substring(temp.indexOf("_")+1,temp.indexOf(":")));
				x.add(Integer.valueOf(temp.substring(temp.indexOf(":")+1,temp.indexOf(","))));
				y.add(Integer.valueOf(temp.substring(temp.indexOf(",")+1)));
			}
			while(name.size() > 0) {
				int index = 0;
				for (int a = 0; a < name.size(); a++) {
					if (x.get(a) < x.get(index)) {
						index = a;
					}
					else if (x.get(a) == x.get(index)) {
						if (y.get(a) > y.get(index)) {
							index = a;
						}
					}
				}
				out.println("Destroyed Ship: "+name.get(index)+" xLoc: "+x.get(index));
//				System.out.println(x.toString());
				name.remove(index);
				type.remove(index);
				x.remove(index);
				y.remove(index);
				
				for (int a = 0; a < name.size(); a++) {
					x.set(a, x.get(a)-convert(type.get(a)));
				}
			}
		}
		in.close();out.close();
		Check.check(file+".out.txt");

	}
	
	public static int convert(String str) {
		if (str.equals("A"))
			return 10;
		else if (str.equals("B"))
			return 20;
		else
			return 30;
	}
}