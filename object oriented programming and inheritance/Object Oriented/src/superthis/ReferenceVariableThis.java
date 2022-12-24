package superthis;

public class ReferenceVariableThis {
	
	String name;
	int age;
	
	//empty constructor
	public ReferenceVariableThis() {
		
		this("Ronaldo",30);//constructor call
		
	}
	
	//constructor with two parameters
	public ReferenceVariableThis(String name, int myAge) {
		
		//this();
		
		this.name = name;
		age = myAge;
		
	}
	
	public void printHello() {
		
		System.out.print("Hello ");
		this.printJava();
		
	}
	
	public void printJava() {
		
		//this();
		
		System.out.print("Java Developers");
		
	}

	public static void main(String[] args) {
		
		ReferenceVariableThis ref = new ReferenceVariableThis();
		System.out.println("Name: " + ref.name);
		System.out.println("Age: " + ref.age);
		
		ref.printHello();

	}

}
