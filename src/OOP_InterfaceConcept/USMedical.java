package OOP_InterfaceConcept;

public interface USMedical extends WHO{
	int min_fee=10;
	
	
	public void physioServices();
	
	public void cardioServices();
	
	public void ENTServices();
	
	public void emergencyServices();
	
	
	//afterjdk 1:8 two major changes:
	//1. can have static method with method body in interface
	
	public static void billing() {
		System.out.println("US---billing");
	}
	
	//2. can have non static default method with method body in interface
	
	default void medicalhistory() {
		System.out.println("US----medicalhistory");
	}
}
