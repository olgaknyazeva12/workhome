package task12;

import java.util.List;

public class Dropdown {
	private List<String> options;
	private boolean isSelected;
	private String name;

	Dropdown(String name, List<String> options, boolean isSelected) {
		System.out.println("Constructor Dropdown is active!");
		this.name = name;
		this.options = options;
		this.isSelected = isSelected;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public boolean isSelected() {
		return isSelected;
	}
}