package staticimportexample;

import static java.lang.Math.*;
import static java.lang.System.out;
import static staticimportexample.Car.*;

public class StaticImportExample {

	public static void main(String[] args) {
		
		out.println(pow(2, 3));
		out.println(max(5, 10));
		
		showSpeed(currentSpeed);
		speedUp(100);
		

	}

}
