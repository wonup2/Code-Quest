import java.util.*;
import java.io.*;

public class Prob06 {

	static Scanner in;
	
	public static void main(String[] args)throws IOException{
		in = new Scanner(System.in);
		//PrintWriter out = new PrintWriter(new File("out.txt"));
		
		int n = Integer.parseInt(in.nextLine());
		for(int i = 0; i < n; i++){
			//processing and output
			String school = in.nextLine();
			String numtemp = in.nextLine();
			int num = Integer.parseInt(numtemp);
			data[] a = new data[num];
			for(int j = 0; j < num; j++) {
				String input = in.nextLine();
				String name = "";
				for(int k = 0; k < input.length(); k++) {
					if(input.charAt(k) == ':') break;
					name+=input.charAt(k);
				}
				int gradepoints = 0;
				int hours = 0;
				for(int k = name.length() + 1; k < input.length() - 1; k++) {
					if(input.charAt(k) == ',') continue;
					char tempgrade = input.charAt(k);
					int temphours = Integer.parseInt(input.substring(k + 1, k + 2));
					k++;
					//System.out.println(tempgrade + " " + temphours);
					if(tempgrade == 'A') gradepoints+=(4 * temphours);
					else if(tempgrade == 'B') gradepoints+=(3 * temphours);
					else if(tempgrade == 'C') gradepoints+=(2 * temphours);
					else gradepoints+=(1 * temphours);
					hours+=temphours;
				}
				double gpa = (double)(gradepoints) / (double)(hours);
				a[j] = new data(name, gpa, hours);
				//System.out.println(a[j].name + " " + gradepoints + " " + a[j].hours);
				//System.out.println(a[j]);
			}
			Arrays.sort(a);
			System.out.println(school + " = " + a[0].name);
		}
		
		in.close(); //out.close();
		//Check.check("out.txt", file + ".out.txt");
	}
	
	static class data implements Comparable<data> {
		String name;
		double gpa;
		int hours;
		
		data(String nameinput, double gpainput, int hoursinput) {
			name = nameinput;
			gpa = gpainput;
			hours = hoursinput;
		}
		
		public String toString() {
			return name + " " + gpa + " " + hours;
		}
		
		@Override
		public int compareTo(data that) {
			if(that.gpa - this.gpa < 0) return -1;
			else {
				if(that.hours - this.hours < 0) return -1;
				else return 1;
			}
		}
	}

}