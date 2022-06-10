package constructorConcept;

public class LoginPage {


	String username;
	String password;
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	

//	public void doLogin(String un, String pwd) {
//		// TODO Auto-generated method stub
//		System.out.println(un);
//		System.out.println(pwd);
//		System.out.println("user is on Home page..");
//		System.out.println("print the title of the Home page");// TODO Auto-generated method stub
//		
//	}
	
	public void doLogin() {
		// TODO Auto-generated method stub
		System.out.println(username);
		System.out.println(password);
		System.out.println("user is on Home page..");
		System.out.println("print the title of the Home page");// TODO Auto-generated method stub
		
	}
}
