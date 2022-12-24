package state;

public class HealthyState implements PlayerState {

	@Override
	public void action(Player player) {
		
		player.attack();
		player.fireBomb();
		player.fireGunBlade();
		player.fireLaserPistol();
		
	}

}
