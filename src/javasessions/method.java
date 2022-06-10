package javasessions;

public class method {

	
	
	public static void M1() {
		System.out.println("data found for M1");
		method.M2();
	}
	public static void M2() {
		System.out.println("data found for M2");
		method.M3();
	}

	public static void M3() {
		System.out.println("data found for M3");
		method.M1();
	}


	
	public static void main(String[] args) {
		method.M1();
		
		
	}

}
