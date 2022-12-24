package state;

public class DeadState implements PlayerState {

	@Override
	public void action(Player player) {
		
		player.dead();
		
	}

}
