package mediator;

public class ComputerColleague extends Colleague {

	public ComputerColleague(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receiveRegisterNotification(Colleague colleague) {
		
		System.out.println("Computer register event with : " + colleague + " : received " + this);
		
	}

	@Override
	public void receiveUnregisterNotification(Colleague colleague) {
		
		System.out.println("Computer left unregister event with : " + colleague + " : received " + this);
		
	}

}
