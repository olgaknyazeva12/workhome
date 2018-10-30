package task12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class Page {
	private ArrayList<Button> myButton;
	private LinkedList<Field> myField;
	private HashSet<Label> myLabel;
	private HashMap<String, Dropdown> myDropdown;
	private float id;
	private String title;

	Page() {
		myButton = new ArrayList<>();
		myField = new LinkedList<>();
		myLabel = new HashSet<>();
		myDropdown = new HashMap<>();
	};

	public void setId(float id) {
		this.id = id;
	}

	public float getId() {
		return this.id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void add(Field field) {

		System.out.println("Add field");

		myField.add(field);
	}

	public void add(Button button) {

		System.out.println("Add button");

		myButton.add(button);
	}

	public void add(Dropdown dropDown) {

		System.out.println("Add button");

		myDropdown.put(dropDown.getName(), dropDown);
	}

	public void add(Label label) {

		System.out.println("Add Label");

		myLabel.add(label);
	}

	public void remove(Field field) {

		System.out.println("Remove field");

		myField.remove(field);
	}

	public void remove(Button button) {

		System.out.println("Remove button");

		myButton.remove(button);
	}

	public void remove(Dropdown dropDown) {

		System.out.println("Remove dropdown");

		myDropdown.remove(dropDown.getName(), dropDown);
	}

	public void remove(Label label) {

		System.out.println("Remove Label");

		myLabel.remove(label);
	}

	public void showButton() {

		for (Button button : myButton) {
			System.out.println("\tThis is button " + button.getName());
		}
	}

	public void showLabel() {

		for (Label label : myLabel) {
			System.out.println("\tThis is label " + label.getName());
		}
	}

	public void showField() {

		for (Field field : myField) {
			System.out.println("\tThis is field " + field.getValue());
		}
	}

	public void showDropdown() {

		for (Map.Entry<String, Dropdown> stringDropDownEntry : myDropdown.entrySet()) {
			System.out.println("\tThis is name dropdown  " + stringDropDownEntry.getKey() + " is selected "
					+ stringDropDownEntry.getValue().isSelected());

			for (String option : stringDropDownEntry.getValue().getOptions()) {

				System.out.println("\t\toption " + option);
			}

		}
	}

	public void sort() {
		Button tmp = null;
		for (int i = 0; i < myButton.size(); i++) {
			for (int j = 0; j < myButton.size() - 1; j++) {
				if ((myButton.get(j).getName().compareTo(myButton.get(j + 1).getName())) > 0) {
					tmp = myButton.get(j);
					myButton.set(j, myButton.get(j + 1));
					myButton.set(j + 1, tmp);
				}
			}
		}
	}
}