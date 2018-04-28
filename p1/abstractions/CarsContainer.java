package p1.abstractions;

import java.util.ArrayList;

public class CarsContainer {
	private ArrayList<Car> list;
	private int maxSize;
	
	public CarsContainer(int maxSize) {
		this.maxSize = maxSize;
		list = new ArrayList<Car>(maxSize);
	}
	
	public boolean haveSpace() {
		return list.size() < maxSize;
	}
	
	public boolean isFull() {
		return !haveSpace();
	}
	
	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	public boolean add(Car car) {
		if (haveSpace()) {
			list.add(car);
			return true;
		}
		
		return false;
	}
	
	public Car pop() {
		if (list.size() > 0) {
			return list.remove(list.size()-1);
		} else {
			return null;
		}
	}
}
