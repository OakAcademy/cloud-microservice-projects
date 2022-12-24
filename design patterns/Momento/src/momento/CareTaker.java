package momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Momento> list = new ArrayList<>();
	
	public void addMomento(Momento state) {
		
		list.add(state);
		
	}
	
	public Momento getMomento(int index) {
		
		return list.get(index);
		
	}

}
