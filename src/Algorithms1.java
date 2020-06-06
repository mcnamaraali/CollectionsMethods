import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {

	public static void main(String[] args) {
		Character[] letters = {'W', 'C', 'M'};
		List<Character> charList = Arrays.asList(letters);
		
		//System.out.println("List contents: ");
		output(charList);
		
		Collections.reverse(charList);
		//System.out.println("List contains: ");
		output(charList);
		
		Character[] lettersCopy = new Character[3];
		List<Character> charListCopy = Arrays.asList(lettersCopy);
		
		Collections.copy(charListCopy, charList);
		System.out.println("Letters copy ");
		output(charListCopy);
		
		Collections.fill(charList, 'R');
		//System.out.println("List contains: ");
		output(charList);
		
	}
	
	private static void output(List<Character> outputList) {
		System.out.println("List contents of the list: ");
		System.out.println();
		
		for(Character chars: outputList) {
			System.out.printf("%s ", chars);
			
		}
		
		System.out.printf("%nList Max: %s ", Collections.max(outputList));
		System.out.printf("%nList Min: %s ", Collections.min(outputList));
		
		
	}

}
