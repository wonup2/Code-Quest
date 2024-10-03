
public class round {

	public static void main(String[] args) {

		//Math.round() 
		double pie = 3.14159265358979;
		System.out.println(Math.round(pie)); 				// 3
		System.out.println(Math.round(pie*100)/100.0); 		//3.14
		System.out.println(Math.round(pie*1000)/1000.0); 	//3.142

		
		//String.format() 
		double money = 4424.243423;
		System.out.println(String.format("%.2f", pie)); 	//3.14
		System.out.println(String.format("%.3f", pie)); 	//3.142
		System.out.println(String.format("%,.3f", money)); 	//4,424.243
		
		
		//Math.round vs String.format()
		money = 5000.000;
		System.out.println(Math.round(money*1000)/1000); 	//5000
		System.out.println(String.format("%.3f", money)); 	//5000.000

	}

}
