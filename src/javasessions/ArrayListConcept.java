package javasessions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		ArrayList<String> name= new ArrayList<String>();
		name.add("pradeep");
		name.add("reema");
		name.add("pramod");
		name.add("manu");
		
		for(String e: name) {
			System.out.println(e);
		}
		System.out.println("-------------");
		//IntStream.range(0, name.size()).forEach(v -> System.out.print(name.get((name.size()-1)-v)));

			Collections.reverse(name);
			for(String e: name) {
				System.out.println(e);
		}
		
		
	}
}


