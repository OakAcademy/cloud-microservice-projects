package command;

public class TurnOnTelevision implements ICommand {
	
	Television television;
	
	public TurnOnTelevision(Television television) {
		
		super();
		this.television = television;
		
	}

	@Override
	public void execute() {
		
		System.out.println("Turning on television");
		television.turnOn();
		
	}
	
	

}
