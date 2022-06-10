package constructorConcept;



import java.util.ArrayList;
import java.util.Arrays;


public class Emptest {

	public static void main(String[] args) {
		Employee e1=new Employee("reema", "23163", true);
		System.out.println(e1.name);
		System.out.println(e1.phone);
		System.out.println(e1.isActive);
		System.out.println(e1.city);
		
		Employee e2=new Employee("pradeep", 30);
		System.out.println(e2.name);
		System.err.println(e2.age);
		
		Employee e3=new Employee("Christen", 3, "124566521", false, "Hubli");
		System.out.println(e3.name+" "+e3.age+" "+e3.phone+" "+e3.isActive+" "+e3.city);
		
		
//		LoginPage lp=new LoginPage("pradeehabd", "454654613");
//		
//		lp.doLogin(lp.username,lp.password);

		LoginPage lp=new LoginPage("pradeehabd", "454654613");
		
		lp.doLogin();
		//ArrayList concept
		ArrayList<String> pradeepcdList= new ArrayList<String>();
		pradeepcdList.add("sbi card");
		pradeepcdList.add("axis");
		pradeepcdList.add("yes bank");
		pradeepcdList.add("idbi");
		Customer cs=new Customer("pradeep", 30, "9164317508", true, pradeepcdList);
		//System.out.println(cs.name+" "+cs.cardList);
		System.out.println(cs.name+" "+cs.age+" "+cs.phone+" "+cs.isActive+" "+cs.cardList);
		
		
		//String[] Array concept
		String[] cdlist= {"onecard","SBI","VISA"};
		
		User s1=new User("reema", 23, cdlist);
		System.out.println(s1.name+" "+s1.age+" "+Arrays.toString(s1.cardlist));
		
	}

}
