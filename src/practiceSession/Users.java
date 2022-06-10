package practiceSession;

public class Users {
	
	String name;
	int age;
	String[] device;
	
	public String[] test(String empName) {
		String product[]=new String[5];
		if(empName.equalsIgnoreCase("reema")) {

		product[0]="laptop";
		product[1]="samsung Smart phone";
		product[2]="ipad";
		//return product;
	}
		else if(empName.equalsIgnoreCase("pradeep")) {
			product[0]="desktop";
			product[1]="smart watch";
			// product;
		}
		else {
			System.out.println("user not found");
		}
		return product;
	}
}
