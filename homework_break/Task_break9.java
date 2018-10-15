package task_break9;

import java.util.Scanner;

public class Task_break9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerStr = new Scanner(System.in);

		String text;
		System.out.println("Enter the text: ");
		text = scannerStr.nextLine();

		Task_break9 obj = new Task_break9();

		StringBuffer sb = new StringBuffer();

		String[] subStr;
		String delimeter = " ";
		subStr = text.split(delimeter);

		String str;

		for (int i = 0; i < subStr.length; i++) {
			sb.append(" ");
			if (obj.CheckLatin(subStr[i]) == true) {
				char c = subStr[i].charAt(0);
				String s = Character.toString(c);
				s = s.toUpperCase();
				char newS = s.charAt(0);
				String p = subStr[i].substring(0, 1).replace(c, newS);
				str = p + subStr[i].substring(1, subStr[i].length());
				sb.append(str);
			} else {
				sb.append(" ");
				sb.append(subStr[i]);
			}
		}

		System.out.println(sb);

	}

	static boolean CheckLatin(String str) {
		return str.matches("[a-zA-Z]+");
	}

}
