package observer;

public class Octal extends Observer {

	public Octal(Subject subject) {
		
		this.subject = subject;
		this.subject.attach(this);
		
	}

	@Override
	public void update() {
		
		System.out.println("Octal string is: " + Integer.toOctalString(subject.getState()));
		
	}

}
