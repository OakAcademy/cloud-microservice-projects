package state;

public class SurvivalState implements PlayerState {

	@Override
	public void action(Player player) {
		
		player.survive();
		player.firePistol();
		
	}

}
