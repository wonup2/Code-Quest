import java.util.*;
public class prob08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = Integer.parseInt(in.nextLine());
		
		for(int n= 1; n <=N; n++) {
			int row = in.nextInt();
			int col = in.nextInt();
			
			//row row-2 = 25; row row-1 50
			//col 
			
			
			for(int i= 0; i < 20; i++) {
				String line = "";
				for (int j = 0; j <20; j++) {
					
					if(i == row && j == col) line += "100 ";
					else if ((i == row-2 || j == col-2) || (i == row+2 || j == col +2)) {
						line += "50 ";
					}
					else if ((i == row-1 || j == col-1)|| (i == row+1 || j == col +1)) {
						line += "25 ";
					}
					else line += "10 ";
				}
				
			}
			
		}
	}
}