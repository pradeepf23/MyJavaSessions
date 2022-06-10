package javasessions;

public class Employees {

	String name;
	int age;
	double salary;
	boolean Permanent;
	public static void main(String[] args) {
		
		
		Employees e1 = new Employees();
		e1.name= "Pradeep";
		e1.age= 30;
		e1.salary= 12.33;
		e1.Permanent= true;
		
		Employees e2 = new Employees();
		e2.name= "Reema";
		e2.age= 29;
		e2.salary= 14.33;
		e2.Permanent= false;
		
		Employees e3 = new Employees();
		e3.name= "Prashat";
		e3.age= 33;
		e3.salary= 44.22;
		e3.Permanent= true;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.Permanent);		
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.Permanent);		
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.Permanent);
		
		System.out.println("**************");
		
		e1=e2;
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.Permanent);		
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.Permanent);		
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.Permanent);
		
		System.out.println("**************");
		e2=e1;
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.Permanent);		
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.Permanent);		
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.Permanent);
		
		System.out.println("**************");
		e1=e3;
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.Permanent);		
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.Permanent);		
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.Permanent);
		
		
	}

}
