package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<MenuItem> items = new ArrayList<>();
	
	public void addItem(MenuItem item) {
		
		items.add(item);
		
	}
	
	public float GetCost() {
		
		float cost = 0.0F;
		
		for(MenuItem item:items) {
			
			cost += item.price();
			
		}
		
		return cost;
		
	}
	
	public void show() {
		
		for(MenuItem item:items) {
			
			System.out.println("Menu Item : " + item.name());
			System.out.println("Packing : " + item.packing());
			System.out.println("Price : " + item.price());
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
