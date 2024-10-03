import java.util.*;

public class CSES1621 {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		int n = in.nextInt();
		
		for(int i=0; i<5; i++) set.add(in.nextInt());

		System.out.println(set);		
		
	}

}

/*
Input:
5
2 3 2 2 3

Output:
2

*/