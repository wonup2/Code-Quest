import java.util.Arrays;

public class dataSplit {

	public static void main(String[] args) {

		String s = "Stempia:1234";
		
		String a[] = s.split(":");
		
		System.out.println(Arrays.toString(a));
		
		s = "Stempia|1234:abcde,457";
		
		String b[] = s.split("[\\|:,]");
		
		System.out.println(Arrays.toString(b));

	}

}
