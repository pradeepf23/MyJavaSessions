package OOP_Inheritance;

public class Audi extends Car{

	
	
	public void theftSafty() {
		System.out.println("Audi ----theftSafty");
	}
	
	@Override
	public void stop() {
		System.out.println("Audi--- Stop");
	}
}
