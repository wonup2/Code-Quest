
public class PrintFormat {

	public static void main(String[] args) {

		double money = 35.6780;
		String name = "Cheyeon Lee";
		int age = 40;
		
		//My name is Chuyeon Lee. I am 40 years old. I have $35.68		
		System.out.printf("My name is %s. I am %d years old. I have $%.2f.\n", name, age, money);		
		
		System.out.printf("%.2f\n", money);  			//35.68	
		System.out.printf("%06.2f\n", 116.0);  			//3.7  -> 03.70
		
		System.out.printf("%-10s,Chuyeon\n", "Lee");  	//Lee       ,Chuyeon       
		System.out.printf("%-10s,Mary\n", "Kim");  		//Kim       ,Mary     
		System.out.printf("%-10s,Raina\n", "Choi");  	//Choi      ,Raina         

		System.out.printf("%10s\n", "Lee");  			//       Lee
		System.out.printf("%10s\n", "kim");  			//       kim
		System.out.printf("%10s\n", "Choi");  			//      Choi

		System.out.printf("$%,3.2f\n", 12345678.0);  	//1234  -> $12,345,678.00
		
		
		System.out.printf("%.2f\n", 36.6745234);
		System.out.println(Math.round(10.567));	//round
		System.out.println(Math.ceil(10.01));	//round up
		System.out.println((int)(10.567));		//round down
		

	}

}
