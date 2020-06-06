import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

	public static void main(String[] args) {
		String[] colours = {"pink", "white", "blue", "royal blue", "red"};
		
		List<String> list = new ArrayList<>(Arrays.asList(colours));
		
		Collections.sort(list);
		System.out.printf("sorted arraylist %s%n", list);
		
		printSearchResults(list, "black");
		printSearchResults(list, "blue");
		printSearchResults(list, "pink");
		

	}
	
	private static void printSearchResults(List<String> list, String key) {
		//binarySearch is a Static method in Collections
		//takes a list as the first argument and a search key for the second argument
		
		System.out.printf("%nSearch for : %s%n", key);
		int result = Collections.binarySearch(list, key); 
		// the result is the index and if not found is -1 (undefined)
		
		if (result >= 0) {
			System.out.printf("Found at index %d%n", result);
		} 
		else {
			System.out.printf("Not found (%d)%n", result);
		}
		
		
	}

}
