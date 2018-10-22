package task10;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerString = new Scanner(System.in);
		Scanner scannerInteger = new Scanner(System.in);

		Sentence sentence = new Sentence();
		sentence.printTextToEnterCountOfWords();
		int numberOfString = scannerInteger.nextInt();

		Word word = new Word();
		word.printUserText();
		String[] strings = new String[numberOfString];

		for (int i = 0; i < strings.length; i++) {
			strings[i] = scannerString.next();
		}

		Scanner scannerString2 = new Scanner(System.in);
		sentence.printUserText();

		String symbol = scannerString2.nextLine();
		word.showDeletedSymbol();
		System.out.println(symbol);

		sentence.printResult();
		word.replaceWithSymbol(strings, symbol);

	}

}