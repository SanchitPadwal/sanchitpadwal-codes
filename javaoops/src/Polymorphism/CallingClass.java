package Polymorphism;

public class CallingClass {

	public static void main(String[] args) {
		System.out.println("Method Overloading : ");
		Pattern p = new Pattern();
		//call method without any argument 
		p.Display();
		//call method with single argument
		System.out.println("\n"); 
		p.Display('#');
		
		System.out.println("\n");
		System.out.println("Method Overriding : ");
		
		Language l1 = new Language();
		l1.infoDisplay();
		System.out.println("\n"); 
		Java j1 = new Java();
		j1.infoDisplay();
	}
}
