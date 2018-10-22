package task10;

public class Word extends Sentence implements IWord {
	static String replacementSymbol = "%";

	public void printUserText() {
		System.out.println("Enter the words: ");
	}

	public void showDeletedSymbol() {
		System.out.println("Your deleted symbol: ");
	}

	public void replaceWithSymbol(String[] yourText, String symbol) {
		StringBuilder dest = new StringBuilder();

		for (int i = 0; i < yourText.length; i++) {

			yourText[i] = yourText[i].replace(symbol, this.replacementSymbol);
			dest.append(' ');
			dest.append(yourText[i]);

		}
		System.out.println(dest);
	}

}
