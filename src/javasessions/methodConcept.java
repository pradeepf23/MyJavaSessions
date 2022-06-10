package javasessions;

public class methodConcept {

	
	
	public void car1() {
		System.out.println("BMW car");
	}
	
	public void car1(int a) {
		System.out.println("Audi car"+" "+ a);
	}
		
	public void car1(int a, String b) {
		System.out.println("Honda car"+" "+a+" "+ b);
	}	
	
	public static void test() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		methodConcept obj=new methodConcept();
		obj.car1();
		obj.car1(30000);
		obj.car1(20000, "Automatic");
		methodConcept.test();

	}

}
