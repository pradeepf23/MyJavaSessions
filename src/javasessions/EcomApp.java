package javasessions;

public class EcomApp {

	
	
	public int test() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public int test1(int a) {
		System.out.println("test method....");
		int b=a+5;
		System.out.println(b);
		return b;
	}
	
	public void studentMarksList(String studentName) {
		System.out.println("student marks list name:.."+ studentName);
		
		if(studentName.equalsIgnoreCase("pradeep")) {
			System.out.println("got 90 marks");
		}
		else if(studentName.equalsIgnoreCase("reema")) {
			System.out.println("got 60 marks");
		}
		else if(studentName.equalsIgnoreCase("raj")) {
			System.out.println("got 30 marks");
		}
		else if(studentName.equalsIgnoreCase("manuel")) {
			System.out.println("got 80 marks");
		}
		else{
			System.out.println("Student name not found");
		}
	}
	public static void main(String[] args) {
		EcomApp aa=new EcomApp();
		aa.test();
		aa.test1(30);
		aa.studentMarksList("ram");
	

	}

}
