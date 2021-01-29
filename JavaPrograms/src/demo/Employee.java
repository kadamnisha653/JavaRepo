package demo;
//Person class cannot be inherited if declared 'final'
public class Employee extends Person {
	String id;
	double salary;
	String role;
	String name = "def";
	
	void showEmpInfo()
	{
		
		System.out.println("Employee id : " + id);
		System.out.println("Role : " + role);
		System.out.println("Salary : " + salary);
		
		System.out.println("Superclass name value : " + super.name);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.name = "abc";
		e1.id = "e123";
		//e1.age = 34;	Error as 'age' is defined as 'final'
		//System.out.println("Employee age : " + e1.age);// age can be used in the derived class
		System.out.println("Emp Name : " + e1.name);
		e1.showPersonInfo();
		e1.showEmpInfo();
	}

}
