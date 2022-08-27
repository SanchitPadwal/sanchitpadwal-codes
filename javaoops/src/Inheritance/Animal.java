package Inheritance;

public class Animal {
	
	//field and method of superclass
	String name;
	
	public void eat()
	{
		System.out.println("i can eat");
	}

}

//inherits from Animal
class dog extends Animal{
	//method of subclass
	public void Display()
	{
		System.out.println("My name is " + name);
	}
}

class main{
	public static void main(String[] args) {
		//create object of subclass
		dog d = new dog();
		
		//access field of superclass
		d.name = "Browany";
		d.Display();
		
		//call method of superclass
		d.eat();
	}
}





// Beauty of inheritance Dog is a Animal : = is-a relationship 