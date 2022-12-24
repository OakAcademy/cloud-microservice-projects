package command;

public class MainTest {

	public static void main(String[] args) {
		
		Television kitchenTV = new Television();
		Television bedroomTV = new Television();
		AirConditioner kitchenAir = new AirConditioner();
		AirConditioner bedroomAir = new AirConditioner();
		
		HomeRemoteControl remote = new HomeRemoteControl();
		remote.setCommand(new TurnOnTelevision(bedroomTV));
		remote.buttonPressed();
		remote.setCommand(new TurnOnTelevision(kitchenTV));
		remote.buttonPressed();
		
		remote.setCommand(new TurnOnAirConditioner(bedroomAir));
		remote.buttonPressed();
		remote.setCommand(new TurnOnAirConditioner(kitchenAir));
		remote.buttonPressed();
		
		remote.setCommand(new TurnOffTelevision(bedroomTV));
		remote.buttonPressed();
		
		remote.setCommand(new TurnOffAirConditioner(bedroomAir));
		remote.buttonPressed();

	}

}
