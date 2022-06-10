package javasessions;

import java.util.Arrays;



public class browser {
	
	public String[] getEmpDevices(String empName) {
	
		System.out.println("Employee name:.."+empName);
		//String product[]=new String[4];
		//String product[];
		if (empName.equalsIgnoreCase("Divya")){
//			product[0]="mackbook";
//			product[1]="iphone 12";
//			product[2]="Sasmung";
//			product[3]="ipad";
			//product[4]="LG"; IOBA
			String product[]= {"mackbook", "iphone 12", "Sasmung", "ipad"};
			return product;
		}
		else if (empName.equalsIgnoreCase("praveen")){
//			product[0]="mackbook";
//			product[1]="iphone X";
//			product[2]="Windows Dell";
			String product[]= {"mackbook", "iphone X", "Windows Dell"};
			return product;
		}
		else if (empName.equalsIgnoreCase("Raju")){
//			product[0]="Dell mouse";
//			product[1]="LG";
//			product[2]="Thoshihba";
			String product[]= {"Dell mouse", "Thoshihba"};
			return product;
		}
		else {
			System.out.println("Employee details not found:..."+empName);
		}
		return null;
		
	}

	public static void main(String[] args) {
		browser br=new browser();
		String dev[]= br.getEmpDevices("raju");
		System.out.println(Arrays.toString(dev));
		
//		for(int i=0; i<dev.length; i++) {
//			System.out.println(dev[i]);
//		}
		
		//reverse for loop
	
//		for(int i=dev.length-1; i>=0;i--) {
//			System.out.println(dev[i]);
//		}
		
		
		for (String e : dev){
		      System.out.println(e);
		}
		
		
		
			
			
			
		

	}

}
