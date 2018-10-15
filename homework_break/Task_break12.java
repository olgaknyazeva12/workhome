package task_break12;

public class Task_break12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "package newTask;\n" + "\n" + "import java.util.Scanner;\n" + "\n" + "/*\n"
				+ "Count of the letters.\n" + " */\n" + "\n"
				+ "public class Task20 {\n" + "    public static void main(String[] args) {\n" + "\n"
				+ "        String text; // объ€вление\n" + "        System.out.println(\"Enter the text: \");\n"
				+ "        Scanner sc1 = new Scanner(System.in);\n" + "        text = sc1.nextLine();\n" + "\n"
				+ "        int col = 0;\n" + "\n" + "        for (int i = 0, n = text.length(); i < n; i++) {//цикл\n"
				+ "            if(text.charAt(i)=='.' || text.charAt(i)==',' || text.charAt(i)=='!' || text.charAt(i)=='?' || text.charAt(i)==':' || text.charAt(i)==';'\n"
				+ "           || text.charAt(i)=='-' || text.charAt(i)=='(' || text.charAt(i)==')' || text.charAt(i)=='\\'' || text.charAt(i)=='\\\"'){\n"
				+ "                col++;\n" + "            }\n" + "        }\n"
				+ "        System.out.println(\"Number = \"+col);//Result\n" + "    }\n"
				+ "}\n" };

		StringBuffer sb = new StringBuffer();

		char withoutComments;

		for (int i = 0, n = str.length; i < n; i++) {
			for (int j = 0, l = str[i].length(); j < l; j++) {
				if (str[i].charAt(j) == '/' && str[i].charAt(j + 1) == '*') {
					do {
						j++;
					} while (str[i].charAt(j) != '/');
				} else if (str[i].charAt(j) == '/' && str[i].charAt(j + 1) == '/') {
					do {
						j++;
					} while (str[i].charAt(j) != '\n');
				}

				withoutComments = str[i].charAt(j);
				sb.append(withoutComments);

			}
		}

		int pos = sb.indexOf("/");
		sb.delete(pos, pos + 1);
		System.out.println(sb);

	}

}
