import java.util.*;
import java.io.*;

public class Prob05 {

	static Scanner in;
	static int num;
	
	public static void main(String[] args)throws IOException{
		in = new Scanner(System.in);
		//PrintWriter out = new PrintWriter(new File("out.txt"));
		
		int n = Integer.parseInt(in.nextLine());
		for(int i = 0; i < n; i++){
			String country = in.nextLine();
			String temp = in.nextLine();
			num = Integer.parseInt(temp);
			data[] a = new data[num];
			for(int j = 0; j < num; j++) {
				double amounttemp = in.nextDouble();
				int amount = (int) (Math.round(amounttemp / 1000) * 1000);
				int year = in.nextInt();
				a[j] = new data(amount, year);
			}
			Arrays.sort(a);
			System.out.println(country + ":");
			for(int j = 0; j < num; j++) {
				System.out.print(a[j].year + " ");
				for(int k = 0; k < a[j].amount / 1000; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		in.close(); //out.close();
		//Check.check("out.txt", file + ".out.txt");

	}
	
	static class data implements Comparable<data> {
		int amount;
		int year;
		
		data(int inputamount, int inputyear) {
			amount = inputamount;
			year = inputyear;
		}
		
		@Override
		public int compareTo(data that) {
			if(this.year - that.year < 0) return -1;
			else {
				if(this.amount - that.amount < 0) return -1;
				else return 1;
			}
		}
	}

}