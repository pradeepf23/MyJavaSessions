package javasessions;

public class ReverseStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium test";
		
//		1) using for loop
		int len= s.length();
		
		String rev="";
		

		for(int i=len-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		System.out.println("----------------");
//
//		2) using StringBuffer class
	
	StringBuffer sf= new StringBuffer(s);
	System.out.println(sf.reverse());
	}

}
