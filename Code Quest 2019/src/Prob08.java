import java.util.Scanner;

public class Prob08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		for(int I = 0;I<num;I++) {
			int[][] thing = new int[20][20];
			
			int row = scan.nextInt();
			int col = scan.nextInt();
			
			for(int i = 0; i<20;i++) {
				for(int j = 0;j<20;j++) {

					if(Math.abs(i - row) <= 2 && Math.abs(j - col) <= 2) {
						thing[i][j] = 25;
					}
					if(Math.abs(i - row) <= 1 && Math.abs(j - col) <= 1) {
						thing[i][j] = 50;
					}
					if(row == i && col == j) {
						thing[i][j] = 100;
					}
				}
			}
			
			for(int i = 0;i<20;i++) {
				for(int j=0;j<19;j++) {
					if(thing[i][j] == 0){ 
						System.out.print("10"); 
					}else System.out.print(thing[i][j]);
					System.out.print(" ");					
				}
				if(thing[i][19] == 0){ 
					System.out.println("10"); 
				}else System.out.println(thing[i][19]);				
			}			
		}
	}
}
