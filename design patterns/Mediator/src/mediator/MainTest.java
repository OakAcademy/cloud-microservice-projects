package mediator;

public class MainTest {

	public static void main(String[] args) {
		
		Mediator mediator = new NetworkMediator();
		
		ComputerColleague c1 = new ComputerColleague(mediator, "John");
		ComputerColleague c2 = new ComputerColleague(mediator, "Daisy");
		ComputerColleague c3 = new ComputerColleague(mediator, "Nicole");
		
		mediator.register(c1);
		mediator.register(c2);
		mediator.register(c3);
		
		mediator.unRegister(c2);

	}

}
