package dvv.test.pkg1;

import java.util.ArrayList;
import java.util.List;

public class Application
{
	public void greet()
	{
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");

		for(String greeting : greetings)
		{
			System.out.println("Greeting: "+greeting);
		}
	}
	public Application()
	{
		System.out.println("Application constructor called");
	}
	
	public static void main(String args[])
	{
		System.out.println("main() method of Application called");
		Application app = new Application();
		app.greet();
	}
}
