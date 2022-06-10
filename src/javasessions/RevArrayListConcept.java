package javasessions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RevArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> intValues = new ArrayList<Integer>();
		intValues.add(1);
		intValues.add(2);
		intValues.add(3);
		intValues.add(4);
		intValues.add(5);


		 IntStream.range(0, intValues.size()).forEach(v -> System.out.print(intValues.get((intValues.size()-1)-v)));
	}

}
