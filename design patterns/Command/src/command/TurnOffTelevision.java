package command;

public class TurnOffTelevision implements ICommand {
	
	Television television;
	
	public TurnOffTelevision(Television television) {
		
		super();
		this.television = television;
		
	}

	@Override
	public void execute() {
		
		System.out.println("Turning off television");
		television.turnOff();
		
	}

}
