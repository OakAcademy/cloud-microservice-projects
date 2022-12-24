package adapter;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxurycar;
	public MovableAdapterImpl(Movable luxurycar) {
		
		this.luxurycar = luxurycar;
		
	}
	
	@Override
	public double getSpeed() {
		return convertMPHtoKMH(luxurycar.getSpeed());
	}
	
	private double convertMPHtoKMH(double mph) {
		
		return mph*16093;
		
	}

}
