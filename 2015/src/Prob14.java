import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Prob14 {
    private static final String INPUT_FILE_NAME = "Prob14.in.txt";
    static byte[] sample, record;
    
    public static void main(String[] args) throws IOException {
    	File inFile = new File(INPUT_FILE_NAME);            
    	FileReader fr = new FileReader(inFile);            
    	BufferedReader br = new BufferedReader(fr);            
    	String inLine = null;           
            
    	int T = Integer.parseInt(br.readLine());            
            
    	while (T-- > 0) {                
    		int maxLength = 0;                
    		ArrayList<String> names = new ArrayList<String>();               
                
    		sample = br.readLine().getBytes();
    		int N = Integer.parseInt(br.readLine());                
                
    		while (N-- > 0) {
                    
    			inLine = br.readLine();                    
    			String[] tokens = inLine.split("=");                    
    			record = tokens[1].getBytes();
                    
                    
    			int longestSubsequenceLength = 7;//LCS(sample, record);
                    
                    
    			if (longestSubsequenceLength > maxLength) {
                        
    				maxLength = longestSubsequenceLength;                        
    				names.clear();                        
    				names.add(tokens[0]);
                    
    			} else if (longestSubsequenceLength == maxLength) {                                               
    				names.add(tokens[0]);                    
    			}                
    		}
                
    		String[] sortedNames = new String[names.size()];                
    		sortedNames = names.toArray(sortedNames);                
    		Arrays.sort(sortedNames);                
                
    		boolean firstPrinted = false;                
    		for (String name : sortedNames) {                    
    			if (firstPrinted) System.out.print(",");                    
    			System.out.print(name);                    
    			firstPrinted = true;                
    		}
                
    		System.out.println();            
    	}
        
        br.close();
        fr.close();       
    }

    static void LCS(byte[] a, byte[] b) {
     
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
