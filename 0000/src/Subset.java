//subset
public class Subset {
	
	static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	static int[] bit = new int[10]; 
 
	static void subset(int k, int n, int sum){
		if (sum > 10) return; 
		if (k == n){
			if (sum == 10){
				for (int i = 0; i < n; i++){
					if (bit[i] > 0) System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		} 
		if(k<10){
			bit[k] = 1; subset(k + 1, n, sum + arr[k]); 
			bit[k] = 0; subset(k + 1, n, sum); 
		}
	} 
	
	public static void main(String[] args){
		subset(0, 10, 0); 
    }		
}

/* answer
1 2 3 4 
1 2 7 
1 3 6 
1 4 5 
1 9 
2 3 5 
2 8 
3 7 
4 6 
10 
*/
