package javasessions;

import java.util.Arrays;
import java.util.Collections;

public class itemsList {

	
	
	public String[] getCustItems(String CustomerName){
		//String product[]=new String[4];
			if(CustomerName.equalsIgnoreCase("reema")) {
		
//				product[0]="mushroom";
//				product[1]="coliflower";
//				product[2]="paneer";
//				product[3]="fish";
				String product[]= {"mushroom","coliflower","paneer","fish"};
				return product;
				
			}
			else if(CustomerName.equalsIgnoreCase("pradeep")) {
//				product[0]="perfume";
//				product[1]="shoes";
//				product[2]="dress";
				String product[]= {"perfume","shoes","dress"};
				return product;
			}
			else {
				System.out.println("customer not found:.."+CustomerName);
			}
			return null;
	}
	
	
	public static void main(String[] args) {
		itemsList it= new itemsList();
		String dev[]= it.getCustItems("pradeep");
		System.out.println(Arrays.toString(dev));
		
		for(int i=0; i<dev.length; i++) {
			System.out.println(dev[i]);
		}
		System.out.println("-----------------------");
		for(String e: dev) {
			System.out.println(e);
		}

	}

}
