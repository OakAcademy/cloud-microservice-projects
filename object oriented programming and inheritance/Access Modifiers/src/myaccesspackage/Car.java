package myaccesspackage;

public class Car {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.myPublicMethod();
		myCar.myProtectedMethod();
		myCar.myDefaultMethod();
		myCar.myPrivateMethod();

	}
	
	public void myPublicMethod() {
		
		System.out.println("This is public modifier");
		
	}
	
	protected void myProtectedMethod() {
		
		System.out.println("This is protected modifier");
		
	}
	
	void myDefaultMethod() {
		
		System.out.println("This is default modifier");
		
	}
	
	private void myPrivateMethod() {
		
		System.out.println("This is private modifier");
		
	}

}
