package task_break6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task_break6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerStr = new Scanner(System.in);

		String text;
		System.out.println("Enter the text: ");
		text = scannerStr.nextLine();

		List<String> list = Arrays.asList(text.split(" "));

		Set<String> uniqueWords = new HashSet<String>(list);

		System.out.println("Result: ");
		for (String word : uniqueWords) {
			System.out.println(word + ": " + Collections.frequency(list, word));

		}
	}

}
