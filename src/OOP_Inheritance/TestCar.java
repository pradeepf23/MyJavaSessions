package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start();       //Overriding
		b.stop();		 //Inherited
		b.refuel();      //Inherited
		b.autoParking(); //individual
		b.engine();
		b.ABS();
		b.TestMech();
		b.ABS();
		b.price();
		BMW.autostart();
		
		
		System.out.println("---Car c=new Car()-----");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.ABS();
		
		System.out.println("---Car c1= new BMW()-----");
		
		Car c1= new BMW(); //Top Casting
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		c.ABS();
		
		
	/*	BMW b1= (BMW)new Car(); //Down Casting //ClassCastException
		b1.start();
		b1.stop();
		b1.refuel();
		b1.autoParking();
		b1.engine();*/
		System.out.println("---Audi a= new Audi()-----");
		
		Audi a= new Audi();
		
		a.start();
		a.stop();
		a.theftSafty();
		a.engine();
		a.ABS();
		a.TestMech();
		
		System.out.println("---Car c2= new Audi()-----");
		Car c2= new Audi();
		c2.stop();
		c2.ABS();
		
		Automobile s=new Vehicle();
		s.ABS();
		s.TestMech();
		
		/*Vehicle v1=(Vehicle)new Automobile(); //Down Casting //ClassCastException
		v1.ABS();
		v1.engine();*/
		
		Mechanical m=new Mechanical();
		m.TestMech();
		
		//Accessing private method using setter and getter
		m.setInfo("pradeep@gmail.com");
		System.out.println(m.getInfo());
		
		
		Mechanical m1 =new Automobile();
		m1.TestMech();
		

		
		
	/*	Automobile s2=(Automobile)new Mechanical();
		s2.ABS();
		s2.TestMech();*/
		
		Engineering e=new Engineering();
		e.price();
		
		Vehicle v1= new Vehicle();
		v1.setInfo("reemapr");
		System.out.println(v1.getInfo());
		
		}
		
	}


