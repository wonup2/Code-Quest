import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {

		long f[] = new long[92];
		f[1]=0;
		f[2] = 1;
		
		for(int i = 3; i<92; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		
		System.out.println(Arrays.toString(f));
	}

}
