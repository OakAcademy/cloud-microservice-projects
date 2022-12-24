package facade;

public class Tournament {
	
	private Football football;
	private Basketball basketball;
	private Handball handball;
	
	public Tournament() {
		
		football = new Football();
		basketball = new Basketball();
		handball = new Handball();
		
	}
	
	public void setFootball() {
		
		football.setGame();
		
	}
	
	public void setBasketball() {
		
		basketball.setGame();
		
	}
	
	public void setHandball() {
		
		handball.setGame();
		
	}
	
	
	
	
	
	
	
	
	

}
