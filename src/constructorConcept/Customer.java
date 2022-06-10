package constructorConcept;

import java.util.ArrayList;

public class Customer {

	
	//usig ArrayList concept
	String name;
	int age;
	String phone;
	boolean isActive;
	ArrayList<String> cardList;
	
	public Customer(String name, int age, String phone, boolean isActive, ArrayList<String> cardList) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.isActive = isActive;
		this.cardList = cardList;
	}
	
}
