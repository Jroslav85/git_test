package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	private static final String TEXT = "It looks like it's going to rain soon.";

	public static void main(String[] args) {

		char[] characters = TEXT.toCharArray();
		List<Character> chList = new ArrayList<>();
		chList = addList(characters);
		System.out.println(chList);
		
		int i = Collections.frequency(chList, 'o');
		System.out.println("frequency(chList, 'o') " + i);
		
		Collections.fill(chList, 'J');
		System.out.println(chList);
	}

	private static List<Character> addList(char[] characters) {
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < characters.length; i++) {
			if (!(characters[i] + "").matches("[\\p{Punct}\\s]+")) {
				list.add(characters[i]);
			}
		}
		return list;
	}
}
