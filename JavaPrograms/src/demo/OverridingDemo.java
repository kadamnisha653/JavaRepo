package demo;

class Shape
{
	public void calcArea()
	{
		System.out.println("Area of shapes");
	}
	
	/*
	 * 
	 * shows an compilation error in the derived classes if method is this overridden.
	final void calcArea()
	{
		System.out.println("Area of shapes");
	}
	*/
	
}

class Circle extends Shape
{
	public void calcArea()
	{
		
		super.calcArea();
		int r=2;
		double pi=3.14,area;
		area=pi*r*r;
		System.out.println("Area of circle is :"+area);
	}
	
	
}
class Rectangle extends Shape
{
	public void calcArea()
	{
		int l=2,b=4,area;
		area=l*b;
		System.out.println("Area of Rectangle is :"+area);
	}
	
}
class Square extends Shape
{
	public void calcArea()
	{
		int s=4,area;
		area=s*s;
		System.out.println("Area of square is :"+area);
	}
}

public class OverridingDemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s=new Shape();
		Shape c=new Circle();
		Shape r=new Rectangle();
		Shape sq=new Square();
		
		c.calcArea();
		
		
	}
}
