package OOPEncapsulation;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmazonApp az= new AmazonApp();
		//1
		az.doLogin("pradeep@gmail.com", "32145@54");
		az.doSearch("samsung smartphoone", 25000, "samsung");
		az.addToCart("samsung smartphoone");
		az.makePayment("215426654", 215);


		az.doLogin("reema@yahoo.com", "reema@654");
		az.doSerch("iphone X");
		az.addToCart("iphone X");

		az.doLogin("reema@yahoo.com", "reema@654");
		az.doSearch("Vivo v9", 20000, "Vivo");
		az.doLogin();
		
		//2
		az.doLogin();
	}

}
