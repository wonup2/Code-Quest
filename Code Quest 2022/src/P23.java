import java.util.*;
import java.io.*;

public class P23 {

    static String file = "19";    //local    
    static PrintWriter out;        //local    
    static Scanner in;            
    static int t, n, m, sx, sy, ex, ey;
    static char grid[][];
    static int used[][];
    static Map<Integer, Integer>[] rotors = new HashMap[7];

    public static Map<Integer, Integer> reverse(Map<Integer, Integer> originalMap) {
        Map<Integer, Integer> reversedMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : originalMap.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        return reversedMap;
    }
    
    public static void main(String[] args) throws IOException{        
        
//         in = new Scanner(new File("Prob" + file+".in"));            //local
//         out = new PrintWriter(new File("out.txt"));        //local        
        in = new Scanner(System.in);                    //submit
        out = new PrintWriter(System.out);  //submit 
        
        int t = in.nextInt();
        
        in.nextLine();
        while(t-- > 0) {
            init();
        }
        
        in.close();        
        out.close(); 
        
//         Check.check("out.txt", "Prob"+file+".out");    //local
    }
    
    static void init() {  
    	n = in.nextInt();
    	m = in.nextInt();
    	
    	grid = new char[n][m];
    	used = new int[n][m];
    	in.nextLine();
    	for(int i = 0; i < n; i++) {
    		String s = in.nextLine();
    		
    		grid[i] = s.toCharArray();
    		if(i % 2 == 0) {
    			for(int j = 1; j < m; j+=3) {
        			if(s.charAt(j) == 'v') {
        				if(j == 1) {
        					sx = i+1;
        					sy = j;
        				} else {
        					ex = i-2;
        					ey = j;
        				}
        			}
        			
        			if(s.charAt(j) == '^') {
        				if(j == 1) {
        					ex = i+1;
        					ey = j;
        				} else {
        					sx = i-2;
        					sy = j;
        				}
        			}
        		}	
    		} else {
    			for(int j = 0; j < m; j+=3) {
    				if(s.charAt(j) == '>') {
        				if(j == 0) {
        					sx = i;
        					sy = j + 1;
        				} else {
        					ex = i;
        					ey = j - 2;
        				}
        			}
        			
        			if(s.charAt(j) == '<') {
        				if(j == 0) {
        					ex = i;
        					ey = j + 1;
        				} else {
        					sx = i;
        					sy = j - 2;
        				}
        			}
    			}
    		}
    		   		
    	}
    	
    	System.out.println(bfs(sx, sy, ex, ey));
    	
    }
    
    static int bfs(int r,int c,int R,int C) {
    	int[] dc = {-3, 3, 0, 0};
    	int[] dr = {0, 0, -2, 2};
        Queue<Integer> q = new LinkedList<>();
        q.add(r);
        q.add(c);
        q.add(1);
        used[r][c] = 1;
        while(!q.isEmpty()) {
        	int oldr = q.poll();
        	int oldc = q.poll();
        	int depth = q.poll();
        	
        	if(oldr == R && oldc == C) {
        		return depth;
        	}
        	for(int i = 0; i < 4; i++) {
        		int nr = oldr + dr[i];
        		int nc = oldc + dc[i];
        		
        		if(nr < 0 || nc < 0 || nr >= n || nc >= m || used[nr][nc] != 0) continue;

        		if(i == 0 && grid[nr][nc+2] == '|') {
        			continue;
        		} else if(i == 1 && grid[nr][nc-1] == '|') {
        			continue;
        		} else if(i == 2 && grid[nr+1][nc] == '-') {
        			continue;
        		} else if(i == 3 && grid[nr-1][nc] == '-') {
        			continue;
        		} 
        		
        		q.add(nr);
        		q.add(nc);
        		q.add(depth+1);
        		used[nr][nc] = depth+1;
//        		System.out.println(nr + " " + nc);
        	}
        	
//        	for(int i = 0; i < n; i++) {
//        		for(int j = 0; j < m; j++) {
//        			System.out.print(used[i][j] + " ");
//        		}
//        		
//        		System.out.println();
//        	}
//        	System.out.println();
        }
        
        
        return -1;
        
    }
}
