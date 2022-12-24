package template;

public abstract class HouseTemplate {
	
	public final void build() {
		
		windows();
		walls();
		pillars();
		foundation();
		
	}
	
	private void windows() {
		System.out.println("Building Glass windows");
	}
	
	public abstract void walls();
	public abstract void pillars();
	private void foundation() {
		
		System.out.println("Building with cement, iron and rods");
		
	}

}
