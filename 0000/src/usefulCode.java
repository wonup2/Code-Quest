import java.util.*;

public class usefulCode {

	public static void main(String[] args) {

		//cube
		System.out.println(Math.cbrt(27)); //3.0


		//Prime Factor
		HashSet<Long> prim = new HashSet<Long>();
		long n = 102438;
		                
		for (long i = 2; i < n; i++) {
		    while (n % i == 0) {
		        prim.add(i);
		        n /= i;    
		     }
		}
		if (n > 2) prim.add(n);		              
		System.out.println(prim);  // [2, 3, 7, 271]

		
		
		//replace string
		String input = "#11#1";
		System.out.println(input.replaceFirst("#", "-").replace("#", "%")); //-11%1
		
		input = "123abcABC$%00a1";
		input = input.replaceAll("[^0-9]", "*");	//123********00*1
		System.out.println(input);
		
		

	}
} 


