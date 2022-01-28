package applicatioin;

public class Person {
	private String name;
	
	//Java provides a default constructor if one isn't given
	//If we provide a constructor, the default one is lost
	
	public Person(String name) {
		this.name = name;
	}
	
	//Can overload the constructor method
	public Person() {
		System.out.println("No parameter constructor called");
	}
	@Override
	public String toString() {
		return name;
	}
}
