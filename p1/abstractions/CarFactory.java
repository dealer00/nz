package p1.abstractions;

abstract public class CarFactory {
	private CarsContainer parking;
	private int orderSize;
	private int createdCounter;
	private String orderModel;
	
	public CarFactory() {
		parking = new CarsContainer(2);
		orderSize = 0;
		createdCounter = 0;
		orderModel = new String();
	}
	
	public void setOrder(int size, String model) {
		orderSize = size;
		orderModel = model;
	}
	
	public Car receiveCar() {
		while (parking.isEmpty());
		return parking.pop();
	}
	
	private Car createCar() {
		return create(++createdCounter, orderModel); 
	}
	
	public int getRemainingCarsCount() {
		return orderSize - createdCounter;
	}
	
	public void startProduction() {
		while (getRemainingCarsCount() > 0) {
			if (!parking.isFull()) {
				parking.add(createCar());
			}
		}
	}
	
	abstract protected Car create(int id, String model);
}
