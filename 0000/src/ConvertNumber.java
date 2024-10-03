public class ConvertNumber {

	public static void main(String[] args) {


		System.out.println( Integer.toHexString(10)); 		//a
		System.out.println( Integer.toOctalString(10));  	//12
		System.out.println( Integer.toBinaryString(10)); 	//1010
		System.out.println( Integer.toString(5, 3));		//12
		
				
		System.out.println( Integer.parseInt("1010", 2)); 	//10
		System.out.println( Integer.parseInt("12", 8)); 	//10
		System.out.println( Integer.parseInt("A", 16)); 	//10	
				
		//octal -> hex ------> octal -> integer -> hex
		//17 --> F     17(8) --> 21(10) --> F(16)
		String oct_hex = Integer.toString(Integer.parseInt("17", 8), 16);
		System.out.println(oct_hex.toUpperCase());  //f

	}

}
