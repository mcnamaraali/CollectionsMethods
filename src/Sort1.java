import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Sort1 {

	public static void main(String[] args) {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		List<String> list = Arrays.asList(suits); //creates list as a list of strings, using the array suits
		System.out.printf("unsorted array: %s%n", list);
		
		Collections.sort(list); //sorts the elements of a List. 
		//The elements' type must implement the interface Comparable.
		System.out.printf("sorted array: %s%n", list);

		
		Collections.sort(list, Collections.reverseOrder()); //sorts the elements of a List. 
		//The elements' type must implement the interface Comparable.
		System.out.printf("sorted array in reverse order: %s%n", list);
		
	}

}
