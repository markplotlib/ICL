package mchesney_ice1;
import java.util.Map;

public class Greeter {
	
	private Template template;
	
	public Greeter(String s) {
		template = new Template(s);
	}
	
	public String getGreeting(Map<String, String> vars) {
		return "";
//		"Hello, " + name + "!\n";
	}
	
}
