package multipleInheritance;

public class ClassC extends ClassA implements InterfaceB {
	
	public void functionI()
	{
		System.out.println("Abstract method implementation of InterfaceB");
	}
	
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.functionA();
		c.functionI();
		
		System.out.println("Datamember of interface : " + num);
	}
	

}
