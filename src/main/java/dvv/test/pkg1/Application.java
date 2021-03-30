package dvv.test.pkg1;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application
{
	public int countWords(String words)
	{
		String[] separatewords = StringUtils.split(words,' ');
		return(separatewords == null) ? 0 : separatewords.length;
	}
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
		int count = app.countWords("Be positive and think positive");
		System.out.println("No of words : "+count);
	}
}
