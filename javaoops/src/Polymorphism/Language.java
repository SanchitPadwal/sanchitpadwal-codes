package Polymorphism;

public class Language {
	
	public void infoDisplay()
	{
		System.out.print("English language ...");
	}

}

class Java extends Language 
{
        public void infoDisplay()
        {
        	System.out.print("Java langauge ...");
        }
}
