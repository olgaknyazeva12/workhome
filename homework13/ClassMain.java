package task12;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Page page1 = new Page();
		Page page2 = new Page();

		Button button1 = new Button("button1", "Yes");
		Button button2 = new Button("button2", "No");

		Label label1 = new Label("label1");
		Label label2 = new Label("label2");

		Field field1 = new Field(1, "field1");
		Field field2 = new Field(2, "field2");

		List<String> list1 = new ArrayList<String>();
		list1.add("Mihail");
		list1.add("Pavel");
		List<String> list2 = new ArrayList<String>();
		list2.add("Andrey");
		list2.add("Igor");

		Dropdown dropdown1 = new Dropdown("dropdown1", list1, false);
		Dropdown dropdown2 = new Dropdown("dropdown2", list2, true);

		System.out.println("Add a button and display in console:");
		page1.add(button1);
		page1.add(button2);
		page1.showButton();

		System.out.println("Change a button and display in console:");
		page1.remove(button1);
		page1.remove(button2);
		button1.setName("Knopka");
		button2.setName("Button1");
		page1.add(button1);
		page1.add(button2);
		page1.showButton();

		System.out.println("Delete the second button and display in console:");
		page1.remove(button2);
		page1.showButton();

		System.out.println("Delete the first button and display in console:");
		page1.remove(button1);
		page1.showButton();

		System.out.println("Add a field and display in console:");
		page1.add(field1);
		page1.add(field2);
		page1.add(field1);
		page1.add(field1);
		page1.showButton();

		System.out.println("Delete a field and display in console:");
		page1.remove(field1);
		page1.showField();

		System.out.println("Add a label and display in console:");
		page1.add(label1);
		page1.add(label2);
		page1.showLabel();

		System.out.println("Delete the first label and display in console:");
		page1.remove(label1);
		page1.showLabel();

		System.out.println("Add Dropdown and display in console:");
		page1.add(dropdown1);
		page1.add(dropdown2);
		page1.showDropdown();

		System.out.println("Delete the second dropdown and display in console:");
		page1.remove(dropdown2);
		page1.showDropdown();

		System.out.println("Add a button and display in console:");

		page2.add(button1);
		page2.add(button2);
		page2.showButton();

		System.out.println("Sort the button and display in console:");
		page2.sort();
		page2.showButton();

	}

}