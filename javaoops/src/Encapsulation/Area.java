package Encapsulation;

// - Encapsulation helps to achieve data hiding

public class Area {
	int length;
	int breadth;
	
	Area(int length , int breadth)
	{
		this.length=length;
		this.breadth = breadth;
	}
	
	//method calculate Area
	public void getArea()
	{
		int area = length * breadth;
		System.out.println("Area is : " + area);
	}
  
}


class Main{
	public static void main(String[] args) {
		
		Area a = new Area(5 , 10);
	    a.getArea();
	   
	}
}