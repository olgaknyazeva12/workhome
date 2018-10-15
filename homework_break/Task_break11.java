package task_break11;
import java.util.Scanner;
public class Task_break11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the text: ");
		Scanner line = new Scanner(System.in);
		String str = line.nextLine();
		char[] chars = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			if ((byte) chars[i] >= 0x30 && (byte) chars[i] <= 0x39)
				sum += (byte) chars[i] - 0x30;
		}
		System.out.println("The sum: " + sum);

	}

}
