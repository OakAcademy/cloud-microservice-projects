package state;

public class MainTest {

	public static void main(String[] args) {
		
		GameContext context = new GameContext();
		
		System.out.println("***********Healthy State***********");
		context.setState(new HealthyState());
		context.gameAction();
		
		System.out.println("***********Survival State***********");
		context.setState(new SurvivalState());
		context.gameAction();
		
		System.out.println("***********Dead State***********");
		context.setState(new DeadState());
		context.gameAction();
		

	}

}
