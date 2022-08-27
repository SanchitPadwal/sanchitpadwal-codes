package classandobject;

public class CarObject {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.brand);
		System.out.println(c1.model);
		System.out.println(c1.year);
		System.out.println(c1.country);
		
		c1.run();
		c1.country = "India";
		
		Car c2 = new Car("TATA" , "Harier" , 2020);
		
		System.out.println(Car.numberOfWheel);
		System.out.println(Car.country);
		
		System.out.println("===================================");
		
		System.out.println(c2.brand);
		System.out.println(c2.model);
		System.out.println(c2.year);
		
		System.out.println(" ===================================== ");
		
	}

}
