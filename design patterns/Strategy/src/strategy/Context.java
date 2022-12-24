package strategy;

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		
		this.strategy = strategy;
		
	}
	
	public float execute(float first, float second) {
		
		return strategy.calculate(first, second);
		
	}

}
