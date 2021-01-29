package demo;
//if 'Person' class is declared 'final' then Person class cannot be inherited.
public class Person {
	String name = "John";
	float ht,wt;
	final int age = 24;
	
	void showPersonInfo()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Height : " + ht + " cms");
		System.out.println("Weight : " + wt + " kgs");
	}
	
	public static void main(String[] args) {
	
		Person p = new Person();
		p.name = "Priya";
		//p.age = 23;		Error as 'age' is defined as 'final'
		p.ht = 150;
		p.wt = 50;
		
		p.showPersonInfo();
		
		
	}

}
