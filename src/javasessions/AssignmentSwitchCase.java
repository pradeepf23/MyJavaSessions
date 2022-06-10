package javasessions;

public class AssignmentSwitchCase {

	public static void main(String[] args) {
		

			// Assignment 1
				
				String role = " VENDOR ";
				
				switch (role.toLowerCase().trim()) {
				case "admin":
					System.out.println("admin login ID and Password");
					break;
				case "customer":
					System.out.println("customer login ID and Password");
					break;
				case "seller":
					System.out.println("seller login ID and Password");
					break;
				case "vendor":
					System.out.println("vendor login ID and Password");
					break;
				case "distributor":
					System.out.println("distributor login ID and Password");
					break;
				default:
					System.out.println("provide correct user ID and Password for..." + role);
					break;
				}
				
				// Assignment 2
				String environment = "UAT ";
				switch (environment.toLowerCase().trim()) {
				case "QA":
					System.out.println("run test cases under QA environment");
					break;
				case "stage":
					System.out.println("run test cases under Stage environment");
					break;
				case "developer":
					System.out.println("run test cases under Developer environment");
					break;
				case "production":
					System.out.println("run test cases under Production environment");
					break;
				case "uat":
					System.out.println("run test cases under UAT environment");
					break;

					
				default:
					System.out.println("provide correct environment");
					break;
				}
				
				//Assignment 3
				int p = 500;
				int q = 700;
				int r = 300;
				int s = 100;
				
				if(p>q && p>r && p>s) {
					System.out.println("p is the greatest");
				}
				else if(q>r && q>s) {
					System.out.println("q is the greatest");
				}
				else if(r>s) {
					System.out.println("r is the greatest");
				}
				else {
					System.out.println("s is the greatest");
				}
						
	}

}
