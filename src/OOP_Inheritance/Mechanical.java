package OOP_Inheritance;

public class Mechanical extends Engineering {

	
	
	public void TestMech() {
		System.out.println("mechanical----TestMechanical");
	}
	private String info;
	public String getInfo() {
		System.out.println("user information:");
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
