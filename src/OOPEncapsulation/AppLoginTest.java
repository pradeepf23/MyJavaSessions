package OOPEncapsulation;

public class AppLoginTest {

	public static void main(String[] args) {
		
		AppLogin app=new AppLogin();
		app.setUsername("pradeep@gmail.com");
		app.setPassword("prad@123");
	
		//(1)
		app.doLogin();
		
		System.out.println("*******");
		
		//(2)
		app.doLogin(app.getUsername(), app.getPassword());
		
		app.setUsername("reema@yahoo.com");
		app.setPassword("reema@321");
		app.doLogin();
		app.doLogin(app.getUsername(), app.getPassword());

	}

}
