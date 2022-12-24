package mediator;

import java.util.ArrayList;
import java.util.List;

public class NetworkMediator implements Mediator {
	
	List<Colleague> colleagues = new ArrayList<>();

	@Override
	public void register(Colleague colleague) {
		
		colleagues.add(colleague);
		for(Colleague newcol:colleagues) {
			
			if(newcol != colleague) {
				newcol.receiveRegisterNotification(colleague);
			}
			
		}
		
	}

	@Override
	public void unRegister(Colleague colleague) {
		
		colleagues.remove(colleague);
		for(Colleague remove:colleagues) {
			
			remove.receiveUnregisterNotification(colleague);
			
		}
		
	}

}
