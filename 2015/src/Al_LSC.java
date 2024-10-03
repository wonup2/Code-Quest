
public class Al_LSC {

	public static void main(String[] args) {
		char[] a = " ABAFCDEF".toCharArray();
		char[] b = "BCFEDE".toCharArray();
		
		LCS(a, b);
	}
	
	static void LCS(char[] a, char[] b) {
	     
        int[][] lcs = new int[a.length+1][b.length+1];
        
        for (int i=0; i<lcs.length; i++) {
            for (int j=0; j<lcs[i].length; j++) {
            	
                if ((i == 0) || (j == 0)) lcs[i][j] = 0;
                
                else if (a[i-1] == b[j-1]) lcs[i][j] = lcs[i-1][j-1] + 1;
                
                else lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);               
            }
        }
        
        System.out.println(lcs[a.length][b.length]);
    }

}
