package Polymorphism;
// =========== Method-Overloading =========================//
public class Pattern {
 
	public void Display()
	{
		for(int i=0 ; i<10 ;i++)
		{
			System.out.print("*");
		}
	}
	
	public void Display(char c)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(c);
		}
	}
	
}

class Main {
	public static void main(String[] args) {
		
		Pattern p = new Pattern();
		p.Display();
		System.out.println("\n");
		p.Display('#');
	}
}