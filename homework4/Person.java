package task4;

public class Person {

	String name;
	String surname;
	int age;
	int phone;

	public void setName(String myName) {
		this.name = myName;
	}

	public void setSurname(String mySurname) {
		this.surname = mySurname;
	}

	public void setAge(int myAge) {
		this.age = myAge;
	}

	public void setPhone(int myPhone) {
		this.phone = myPhone;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getAge() {
		return this.age;
	}

	public int getPhone() {
		return this.phone;
	}

	public void printAllInformation(String myName, String mySurname, int myAge, int myPhone) {
		System.out.println(myName + " " + mySurname + " " + myAge + " " + myPhone);
	}

	public void printName(String myName, String mySurname) {
		System.out.println(myName + " " + mySurname);
	}

	public boolean isAdult(int myAge) {
		return myAge > 18;
	}

}
