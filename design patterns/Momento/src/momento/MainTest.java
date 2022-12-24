package momento;

public class MainTest {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State1");
		careTaker.addMomento(originator.saveStateMomento());
		originator.setState("State2");
		careTaker.addMomento(originator.saveStateMomento());
		originator.setState("State3");
		careTaker.addMomento(originator.saveStateMomento());
		originator.setState("State4");
		careTaker.addMomento(originator.saveStateMomento());
		
		System.out.println("Current state is " + originator.getState());
		originator.getStateFromMomento(careTaker.getMomento(0));
		
		System.out.println("First state is " + originator.getState());
		originator.getStateFromMomento(careTaker.getMomento(1));
		
		System.out.println("Second state is " + originator.getState());
		originator.getStateFromMomento(careTaker.getMomento(2));
		
		System.out.println("Third state is " + originator.getState());
		originator.getStateFromMomento(careTaker.getMomento(3));

	}

}
