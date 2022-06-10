package javasessions;

public class SwitchCaseConcept {
// two duplicate cases are not allowed
	public static void main(String[] args) {
		
		String name= "Pramod";
		switch (name) {
		case "Manu":
			System.out.println("manu got 10 marks");
			break;
		case "Pradeep":
			System.out.println("Pradeep got 20 marks");
			break;
		case "Prashat":
			System.out.println("Prashat got 30 marks");
			break;
		case "Pramod":
			System.out.println("Pramod got 40 marks");
			break;

		default:
			System.out.println("Student name is not found");
			break;
		}

		//
		
		String browser= " OPERA ";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "ff":
			System.out.println("launch firefox");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("provide correct browser" + browser);
			break;
		}
		
		// WITHOUT BREAK
		
//		String browser= " OPERA ";
//		switch (browser.toLowerCase().trim()) {
//		case "chrome":
//			System.out.println("launch Chrome");
//			
//		case "ff":
//			System.out.println("launch Firefox");
//			
//		case "ie":
//			System.out.println("launch ie");
//		
//		case "opera":
//			System.out.println("launch Opera");
//			
//
//		default:
//			System.out.println("provide correct browser...." + browser);
//			break;
//		}
		
	//
		int a = 500;
		int b = 700;
		int c = 300;
		
		if(a>b && a>c) {
			System.out.println("a is the greatest");
		}
		else if(b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
		
		//Assignment
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
