package task12;

public class Button {
	private String name;
	private String action;

	Button(String name, String action) {
		System.out.println("Constructor Button is active!");
		this.name = name;
		this.action = action;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return this.action;
	}
}
