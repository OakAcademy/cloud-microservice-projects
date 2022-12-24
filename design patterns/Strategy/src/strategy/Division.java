package strategy;

public class Division implements Strategy {

	@Override
	public float calculate(float a, float b) {
		return a/b;
	}

}
