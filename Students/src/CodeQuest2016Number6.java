import java.util.*;
import java.io.*;
public class CodeQuest2016Number6 {
	
	static Scanner in;
	static String school;
	static int N, n;
	static grade[] group;
	
	public static void main(String[] args) throws IOException{
		in = new Scanner(new File("CodeQuest2016Number6.in"));
		N = Integer.parseInt(in.nextLine());
		for(int i = 0; i < N; i++) {
			init();
		}
	}
	
	static void init() {
		school = in.nextLine();
		n = Integer.parseInt(in.nextLine());
		group = new grade[n];
		for(int i = 0; i < n; i++)
			group[i] = new grade(in.nextLine());
		Arrays.sort(group);
		System.out.println(school + " = " + group[0].name);
	}
	
	public static class grade implements Comparable<grade> {
		String name;
		String[] array;
		int totalhours = 0;
		grade(String s){
			String[] tempArray = s.split(":");
			String[] gradeArray = tempArray[1].split(",");
			name = tempArray[0];
			array = gradeArray.clone();
			for(String temp: array)
				totalhours += temp.charAt(1);
		}
		public double convert() {
			double ans = 0;
			int val, totalhours = 0;
			for(String s: array) {
				char letter = s.charAt(0);
				int hours = Integer.parseInt("" + s.charAt(1));
				totalhours += hours;
				switch(letter) {
				case 'A': val = 4;
				break;
				case 'B': val = 3;
				break;
				case 'C': val = 2;
				break;
				default: val = 1;
				break;
				}
				ans += (val * hours);
			}
			ans /= totalhours;
			return ans;
		}
		@Override
		public int compareTo(grade next) {
			// TODO Auto-generated method stub
			if(convert() == next.convert())
				return next.totalhours - this.totalhours;
			else {
				if(next.convert() < convert())
					return -1;
				return 1;
			}
			//return convert() == next.convert() ? 0 - this.totalhours - next.totalhours : next.convert() < convert() ? return -1; return 1;
		}
		public String toString() {
			return name + " " + convert() + " " + totalhours;
		}
		
	}

}
