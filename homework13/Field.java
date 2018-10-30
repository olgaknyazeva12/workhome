package task12;

public class Field {
	private int id;
	private String value;

	Field(int id, String value) {
		System.out.println("Constructor Field is active!");
		this.id = id;
		this.value = value;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
