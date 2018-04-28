package p1.factories;

import p1.abstractions.Car;
import p1.abstractions.CarFactory;
import p1.cars.Ford;

public class FordFactory extends CarFactory {
	public FordFactory() {
		super();
	}

	@Override
	protected Car create(int id, String model) {
		Ford car = new Ford(model);
		
		car.setVin("ford:" + id);
		
		return car;
	}
	
	
}
