package command;

public class TurnOffAirConditioner implements ICommand {
	
	AirConditioner airConditioner;
	
	public TurnOffAirConditioner(AirConditioner airConditioner) {
		
		super();
		this.airConditioner = airConditioner;
		
	}

	@Override
	public void execute() {
		
		System.out.println("Turning off AirConditioner");
		airConditioner.turnOff();
		
	}

}
