package practiceSession;

import java.util.Arrays;

public class empTest {

	public static void main(String[] args) {
		
		Users u= new Users();
		String dev[]=u.test("pradeep");
		System.out.println(Arrays.toString(dev));

		
		Itemlist li=new Itemlist();
		String s1[]=li.getItems("pammu");
		System.out.println(Arrays.toString(s1));
	}

}
