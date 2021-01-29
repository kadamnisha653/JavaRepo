package demo;

public class ConstructorDemo {

	int n;
	char c;
	String s ;//= "demo";
	//default constructor
	ConstructorDemo() {
		n = 1;
		c = 'a';
		s = "str1";
		System.out.println("This is a demo constructor");
	}
	
	ConstructorDemo(int n1, char c1)
	{
		n = n1;
		c = c1;
	}
	
	//parameterized constructor
	ConstructorDemo(int n1, char c1, String s1) {
		n = n1;
		c = c1;
		s = s1;
	}
	
	void display()
	{
		System.out.println("Value of int : " + n);
		System.out.println("Value of char : " + c);
		System.out.println("Value of String : " + s);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		ConstructorDemo cd1 = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(2, 'b');
		ConstructorDemo cd3 = new ConstructorDemo(3, 'c', "str2");
		
		cd1.display();
		
		cd2.display();
		
		cd3.display();
		
		//cd.s = "test";
		
//		System.out.println("Value assigned using default : " + cd1.n);
//		System.out.println("Value assigned using default : " + cd1.c);
//		System.out.println("Value assigned using default : " + cd1.s);
//		System.out.println("");
//		System.out.println("value assigned using two parameters : " + cd2.n);
//		System.out.println("value assigned using two parameters : " + cd2.c);
//		System.out.println("");
//		System.out.println("Value assigned using parameterized (3 values)  : " + cd3.n);
//		System.out.println("Value assigned using parameterized : " + cd3.c);
//		System.out.println("Value assigned using parameterized : " + cd3.s);
	}

}
