package mchesney_ice1;
import java.util.Scanner;

public class Greeter {
	
	private String name;
	
	public Greeter() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name? ");
		this.name = keyboard.nextLine();
		keyboard.close();
	}
	
	public String getName() {
		return name;
	}

}
