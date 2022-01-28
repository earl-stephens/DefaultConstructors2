package applicatioin;

public class App {

	public static void main(String[] args) {
		
		/* The () after Person means that we are calling the
		 * Person class constructor method
		 */
		Person person = new Person("Joe");
		System.out.println(person);
		
		Person person1 = new Person();
		System.out.println(person1);

	}

}
