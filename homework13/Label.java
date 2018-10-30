package task12;

public class Label {
	private String name;

	Label(String name) {
		System.out.println("Constructor Label is active!");
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
