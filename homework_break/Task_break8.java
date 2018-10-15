package task_break8;

import java.util.Scanner;

public class Task_break8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ¬ тексте определить все согласные буквы, встерчающиес€ не более чем в двух
		 * словах.
		 */

		String text;
		System.out.println("Enter the text: ");
		Scanner sc1 = new Scanner(System.in);
		text = sc1.nextLine();

		String[] subStr;
		String delimeter = " ";
		subStr = text.split(delimeter);
		String[] symbol = new String[] {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t","v", "w", "x", "y", "z"};
				//"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t","v", "w", "x", "y", "z" };
		//"б", "в", "г", "д", "ж", "з", "й", "к", "л", "м", "н", "п", "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ"

		StringBuffer sb = new StringBuffer();

		for (int i = 0, n = subStr.length; i < 2; i++) {
			sb.append(" ");
		
			for (int j = 0, k = subStr[i].length(); j < k; j++) {
				for (int l = 0, p = symbol.length; l < p; l++) {
					for (int z = 0, s = symbol[l].length(); z < s; z++) {
						if (subStr[i].charAt(j) == symbol[l].charAt(z)) {
							sb.append(subStr[i].charAt(j));
						}
					}

				}
			}
		}

		System.out.println(sb);

	}

}