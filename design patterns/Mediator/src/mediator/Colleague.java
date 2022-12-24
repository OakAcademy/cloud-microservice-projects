package mediator;

public abstract class Colleague {
	
	private Mediator mediator;
	private String name;
	
	public Colleague(Mediator mediator, String name) {
		
		this.mediator = mediator;
		this.name = name;
		
	}
	
	public String toString() {
		
		return name;
		
	}
	
	public abstract void receiveRegisterNotification(Colleague colleague);
	public abstract void receiveUnregisterNotification(Colleague colleague);

}
