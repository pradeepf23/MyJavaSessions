package OOPEncapsulation;

public class AmazonApp {
	
	

	public AmazonApp doLogin() {
		System.out.println("Login to app:...");
		return this;
	}
	public AmazonApp doLogin(String username, String password) {
		System.out.println("Login to app:..."+username+" : "+password);
		return this;
	}
	public AmazonApp doSerch(String productName) {
		System.out.println("Search product:..."+productName);
		return this;
	}
	public AmazonApp doSerch(String productName, int price) {
		System.out.println("Search product:..."+productName+" : "+ price);
		return this;
	}
	public AmazonApp doSearch(String productName, int price, String seller) {
		System.out.println("Search product:..."+productName+" : "+ price+" : "+seller);
		return this;
	}
	public AmazonApp addToCart(String productName) {
		System.out.println("Add product to Cart:..."+productName);
		return this;
	}
	public AmazonApp makePayment(String cc, int CVV) {
		System.out.println("making Payment:..."+cc+" : "+CVV);
		return this;
	}
	public AmazonApp makePayment(String upi) {
		System.out.println("making Payment:..."+upi);
		return this;
	}
	public AmazonApp Logout() {
		System.out.println("Logout from app:...");
		return this;
	}
	
//	public AmazonApp doLogin() {
//		System.out.println("Login to app:...");
//		doLogin("pradeep@gmail.com", "32145@54");
//		doSearch("jio dongle", 3000, "Jio");
//		addToCart("jio dongle");
//		makePayment("54612532", 854);
//		doSerch("Watch");
//		doSerch("Helmate", 1000);
//		makePayment("45684@prad");
//		Logout();
//		return this;
//	}
//	private AmazonApp doLogin(String username, String password) {
//		System.out.println("Login to app:..."+username+" : "+password);
//		return this;
//	}
//	private AmazonApp doSerch(String productName) {
//		System.out.println("Search product:..."+productName);
//		return this;
//	}
//	private AmazonApp doSerch(String productName, int price) {
//		System.out.println("Search product:..."+productName+" : "+ price);
//		return this;
//	}
//	private AmazonApp doSearch(String productName, int price, String seller) {
//		System.out.println("Search product:..."+productName+" : "+ price+" : "+seller);
//		return this;
//	}
//	private AmazonApp addToCart(String productName) {
//		System.out.println("Add product to Cart:..."+productName);
//		return this;
//	}
//	private AmazonApp makePayment(String cc, int CVV) {
//		System.out.println("making Payment:..."+cc+" : "+CVV);
//		return this;
//	}
//	private AmazonApp makePayment(String upi) {
//		System.out.println("making Payment:..."+upi);
//		return this;
//	}
//	private AmazonApp Logout() {
//		System.out.println("Logout from app:...");
//		return this;
//	}

}
