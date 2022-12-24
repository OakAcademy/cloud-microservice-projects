package flyweight;

import java.util.HashMap;

public class CarFactory {
	
	private HashMap<String, Car> carList = new HashMap<>();
	
	public Car getCar(String carType) {
		
		Car car = carList.get(carType);
		
		if(car == null) {
			
			if (carType == "Mercedes") {
				
				car = new Mercedes();
				System.out.println("A Mercedes car was created and saved");
				
			}else if (carType == "Jaguar") {
				
				car = new Jaguar();
				System.out.println("A Jaguar car was created and saved");
				
			}else if (carType == "Citroen") {
				
				car = new Citroen();
				System.out.println("A Citroen car was created and saved");
				
			}
			
		}
		
		return car;
		
	}

}
