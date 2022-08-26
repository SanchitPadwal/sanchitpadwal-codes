package Abstraction;
// Abstraction : achieve abstraction two ways : 1. Abstract Class 2. Interface  
abstract class Animal {
    // abstract method does not body
	public abstract void AnimalSound();
	
	//Regular method 
	public void sleep()
	{
		System.out.println("zeeeeee .....");
	}
	
}

//subclass dog inherits from Animal
class dog extends Animal
{
	// The body of animalSound() is provided here
      	public void AnimalSound()
      	{
      		System.out.println("dog sound : Bhoww ..  Bhoww .. ");
      	}
}

class main{
	public static void main(String[] args) {
		//create object subclass
		dog d = new dog();
		d.AnimalSound();
		d.sleep();
	}
}