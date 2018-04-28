package p1;

import p1.abstractions.Car;
import p1.abstractions.CarFactory;
import p1.abstractions.CarsContainer;

public class Track {
	private CarsContainer freight;
	
	public Track(int size) {
		freight = new CarsContainer(size);
	}
	
	public void receiveFrom(CarFactory factory) {
		int received = 0;
		
		while (received < 2) {
			freight.add(factory.receiveCar());
		}
	}
	
	public Car dischargeCar() {
		if (!isEmpty()) {
			return freight.pop();
		}
		
		return null;
	}
	
	public boolean isEmpty() {
		return freight.isEmpty();
	}
	
	public boolean isFull() {
		return freight.isFull();
	}
}
