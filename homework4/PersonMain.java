package task4;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();

		person.setName("Olya");
		person.setSurname("Knyazeva");
		person.setAge(21);
		person.setPhone(270771244);

//Set ans Get
		System.out.println("Methods Set è Get");
		System.out.println("Name: " + person.getName());
		System.out.println("Surname: " + person.getSurname());
		System.out.println("Age: " + person.getAge());
		System.out.println("Phone: " + person.getPhone());

//printAllInformation
		System.out.println();
		System.out.println("Method printAllInformation");
		person.printAllInformation("Vasya", "Ivaniv", 99, 102);

//printName
		System.out.println();
		System.out.println("Method printName");
		person.printName("Alena", "Ivanova");

//isAdult
		System.out.println();
		System.out.println("Method isAdult");
		System.out.println(person.isAdult(34));
	}

}
