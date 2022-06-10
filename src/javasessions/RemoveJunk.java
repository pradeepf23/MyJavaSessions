package javasessions;

public class RemoveJunk {

	public static void main(String[] args) {
		
		// Using Regular Expression [^a-zA-Z0-9]
		
		String s= "!@#$%*& Testing !#@$#%#%# Selenium @#!$@@ Java";
		
	 s= s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);

	}

}
