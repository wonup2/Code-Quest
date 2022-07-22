import java.util.*;
public class hASCIISquares {
	static int x;
	static char[][] grid;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < t; i++) {
			x = Integer.parseInt(sc.nextLine());
			char[][] gridInput = new char[x][];
			int maxLength = 0;
			for(int j = 0; j < x; j++) {
				String[] input = sc.nextLine().split("");
				gridInput[j] = new char[input.length];
				for(int k = 0; k < input.length; k++)
					gridInput[j][k] = input[k].charAt(0);
				maxLength = Math.max(maxLength, input.length);
			}
			grid = new char[x][maxLength];
			for(int j = 0; j < x; j++) {
				for(int k = 0; k < maxLength; k++) {
					if(k >= gridInput[j].length)
						grid[j][k] = '!';
					else
						grid[j][k] = gridInput[j][k];
				}
			}
			int cntSquares = 0;
			for(int j = 1; j < x; j++)
				cntSquares += count(j);
			System.out.println(cntSquares);
		}
		sc.close();
	}
	public static int count(int n) {
		int cnt = 0;
		for(int r = 0; r <= grid.length - (n + 1); r++) {
			for(int c = 0; c <= grid[r].length - (n * 2 + 1); c++) {
				boolean didBreak = false;
				for(int j = 1; j < 1 + 2 * n; j += 2) {
					if(!(grid[r][c + j] == '_' && grid[r + n][c + j] == '_')) {
						didBreak = true;
						break;
					}
					if(didBreak)
						break;
				}
				if(didBreak)
					continue;
				for(int j = 1; j <= n; j++) {
					if(!(grid[r + j][c] == '|' && grid[r + j][c + 2 * n] == '|')) {
						didBreak = true;
						break;
					}
				}
				if(!didBreak)
					++cnt;
			}
		}
		return cnt;
	}
}