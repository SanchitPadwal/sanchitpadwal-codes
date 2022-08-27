package classandobject;

public class Car {
	

	static int numberOfWheel = 4;	
	public String brand;
	public String model;
	public int year;
	static String country;
	
	public Car(String brand,  String model , int year )
	{
		System.out.println("Inside Constructor ");
		System.out.println("Brand is : " + brand);
		System.out.println("Model is : " + model);
		System.out.println("Year  is : " + year);
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public Car()
	{
		System.out.println("Car constructor with parameter");
		brand="Mahindra";
		model="XUV500";
		year=2020;
		country="India";
	}
	
	public Car(int n)
	{
		this();
		System.out.println("Car constructor with parameter called , with value" + n);
	}
	
	public Car(int n , int m)
	{
		this();
		System.out.println("Car constructor with paramter called , with value " + n);
	}
	
	public void run()
	{
		System.out.println("car running .......");
	}
}
