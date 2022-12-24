package observer;

public class Hexa extends Observer {

	public Hexa(Subject subject) {
		
		this.subject = subject;
		this.subject.attach(this);
		
	}

	@Override
	public void update() {

		System.out.println("Hexa string is: " + Integer.toHexString(subject.getState()));

	}

}
