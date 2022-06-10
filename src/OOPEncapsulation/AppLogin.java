package OOPEncapsulation;

public class AppLogin {
	
	
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//(1)
	public void doLogin() {
		System.out.println("enter username:.. "+username);
		System.out.println("enter password:.. "+password);
		System.out.println("user loged in");
	}
	
	//(2)
	public void doLogin(String un, String pwd) {
		System.out.println("enter username:.. "+un);
		System.out.println("enter password:.. "+pwd);
		System.out.println("user loged in");
	}
	

}
