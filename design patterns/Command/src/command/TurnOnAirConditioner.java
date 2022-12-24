package command;

public class TurnOnAirConditioner implements ICommand {
	
	AirConditioner airConditioner;
	
	public TurnOnAirConditioner(AirConditioner airConditioner) {
		
		super();
		this.airConditioner = airConditioner;
		
	}

	@Override
	public void execute() {
		
		System.out.println("Turning on AirConditioner");
		airConditioner.turnOn();
		
	}

}
