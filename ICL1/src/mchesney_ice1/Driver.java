package mchesney_ice1;

public class Driver {

	public static void main(String[] args) {
		Greeter greeting = new Greeter();
		String name = greeting.getName();
		
		System.out.printf("Hello, %s!\n", name);
	}

}
