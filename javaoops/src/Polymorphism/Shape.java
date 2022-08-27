package Polymorphism;

public class Shape {
	
	public void Render()
	{
		System.out.println("Rendering shape ...."); 
	}
}

class Circle extends Shape
{
     public void Render()
     {
    	 System.out.println("Rendering Circle ....");
     }
	
} 


class Square extends Shape
{
	 public void Render()
	 {
	      System.out.println("Rendering Square");	 
	 }
} 
