package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		 
		if(a==b) {
			System.out.println("a and b are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		//
		
		if(true) {
			System.out.println("Hi..");
		}
		else {
			System.out.println("Bye..");
		}
		
		//
		boolean flag = false;
			if(flag) {
			System.err.println("Hello Selenium...");
		
		}
		else {
			System.err.println("Bye Selenium...");
		}
		
		
			//
			
			int marks = 31;
			if(marks<=100) {
				System.out.println("Hi student....");
				
				if(marks>=90) {
					System.out.println("Grade A");
				}
				else if(marks>=60) {
					System.out.println("Grade B");
				}
				else if(marks>=30) {
					System.out.println("Grade C");
				}
			}
			else {
				System.out.println("wrong");

			}
			
			//		if else example
			
			int number = 25;
			if(number <=10) {
				System.out.println("Hiii..");
			}
			else if(number <=20) {
				System.out.println("Hello...");
			}
			else {
				System.out.println("Bye");
			}
			
			//
			String name ="Reema";
			
			if(name.equals("Pradeep")) {
				System.out.println("pradeep got 10 marks");
			}
			else if(name.equals("Reema")) {
				System.out.println("reema got 20 marks");
			}
			else if(name.equals("Supriya")) {
				System.out.println("supriya got 30 marks");
			}
			else {
				System.out.println("Student data not found");
			}
	}

}
