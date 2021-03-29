package dvv.test.pkg1;

public class Application
{
	public Application()
	{
		System.out.println("Application constructor called");
	}
	
	public static void main(String args[])
	{
		System.out.println("main() method of Application called");
		Application app = new Application();
	}
}
