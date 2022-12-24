package iterator;

public class MainTest {

	public static void main(String[] args) {
		
		NameCollection collection = new NameCollection();
		
		for(Iterator iterator = collection.getIterator(); iterator.hasNext();) {
			
			String authorName = (String) iterator.next();
			
			System.out.println("The author name is " + authorName);
			
		}

	}

}
