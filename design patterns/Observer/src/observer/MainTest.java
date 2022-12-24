package observer;

public class MainTest {

	public static void main(String[] args) {
		
		Subject subject = new Subject();
		new Hexa(subject);
		new Octal(subject);
		new Binary(subject);
		
		System.out.println("State changed with 12");
		subject.setState(12);
		
		System.out.println("State changed with 14");
		subject.setState(14);

	}

}
