package mchesney_ice1;

public class Driver {

	public static void main(String[] args) {
		Greeter greeting = new Greeter();

		String templateStr = "Hello $name - that's a nice $color shirt.";
		Map<String, String> templateVars = new HashMap<String, String>();
		
		System.out.println(greeting.getGreeting());
	}

}
