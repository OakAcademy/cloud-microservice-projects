package prototype;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {
	
	private static Map<String, AccessControl> map = new HashMap<>();
	
	static {
		
		System.out.println("Fetching From External resources and create access control objects");
		
		map.put("USER", new AccessControl("USER", "DO WORK"));
		map.put("ADMIN", new AccessControl("ADMIN", "Add/Remove Reports"));
		map.put("MANAGER", new AccessControl("MANAGER", "Generate Reports"));
		map.put("VP", new AccessControl("VP", "Modify reports"));
		
	}
	
	public static AccessControl getAccessControlObjects(String controlLevel) {
		
		AccessControl ac = null;
		ac = map.get(controlLevel);
		if(ac != null)
			return ac.clone();
		return null;
		
	}

}
