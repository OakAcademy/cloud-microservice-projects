package adapter;

public class MainTest {

	public static void main(String[] args) {
		
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		System.out.println(bugattiVeyronAdapter.getSpeed());

	}

}
