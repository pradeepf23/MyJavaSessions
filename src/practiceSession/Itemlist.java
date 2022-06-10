package practiceSession;

public class Itemlist {

	
	
	public String[] getItems(String customerName) {
		if(customerName.equalsIgnoreCase("prashant")) {
			String items[]= {"remote","phone","perfume"};
			return items;
		}
		else if(customerName.equalsIgnoreCase("pammu")) {
			String items[]= {"mouse","headphone","guitar"};
			return items;
		}
		else {
			System.out.println("customer not found"+ customerName);
		}
		return null;
	}
}
