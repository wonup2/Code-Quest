
public class Sub extends Super{

	public void getValue(int n) {
		System.out.println("Sub: " + n);
	}
	
	public void getValue() {
		System.out.println("Sub");
	}
	
	public static void main(String[] args) {

		Super o = new Sub();
		
		((Sub)o).getValue(5);
		
	}

}
