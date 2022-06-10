package OOPEncapsulation;

import java.util.ArrayList;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.setName("pradeep");
		e.setAge(23);
		e.setCity("Hubli");
		//System.out.println(e.getName()+" "+e.getAge()+" "+e.getCity());
		
		String name=e.getName();
		int age=e.getAge();
		String city= e.getCity();
		System.out.println(name+" "+age+" "+city);
		
		///////
		User u1=new User();
		u1.name="reema";
		u1.age= 30;
		
		ArrayList<String> devList= new ArrayList<String>();
		devList.add("mackbook pro");
		devList.add("iph 12");
		devList.add("Samsung");
		u1.setDeviceList(devList);
		
		u1.setSalary(23.33);
		System.out.println(u1.name+" "+u1.age+" "+u1.getSalary()+u1.getDeviceList());
	}

}
