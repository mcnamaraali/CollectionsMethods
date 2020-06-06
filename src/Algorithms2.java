import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {

	public static void main(String[] args) {
		String[] arrayOfcolours = {"red", "white", "blue", "black"};
		List<String> listOfColours = Arrays.asList(arrayOfcolours);
		ArrayList<String> arrayList = new ArrayList<>(); //remember we do not need to specify a length
		
		arrayList.add("green");
		arrayList.add("white");
		arrayList.add("orange");
		arrayList.add("red");
		
		System.out.print("Before addAll, arrayList contains: ");
		
		for (String s: arrayList) {
			System.out.printf("%s ", s);
		}
		
		Collections.addAll(arrayList,arrayOfcolours);
		
		System.out.printf("%nAfter addAll, arrayList contains: ");
		
		for (String s: arrayList) {
			System.out.printf("%s ", s);
		}
		
		int freq = Collections.frequency(arrayList, "green");
		System.out.printf("%nFrequency of green in the arrayList is : %d%n", freq);
		
		//checking for common elements
		boolean disjoint = Collections.disjoint(listOfColours, arrayList);
		System.out.printf("%nlistOfColours and arrayList %s elements in common %n",
				(disjoint ? "do not have": "have")); //returns TRUE if they have NO elements in common

	}

}
