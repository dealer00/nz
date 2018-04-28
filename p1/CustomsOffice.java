package p1;

import java.util.ArrayList;

import p1.abstractions.CarFactory;
import p1.abstractions.CarsContainer;

public class CustomsOffice {
	public final int PARKING_SIZE = 10000;
	
	private CarsContainer parking;
	private ArrayList<CarFactory> factories;
	
	public CustomsOffice() {
		parking = new CarsContainer(PARKING_SIZE);
		factories = new ArrayList<CarFactory>();
	}
	
	public void addFactory(CarFactory factory) {
		factories.add(factory);
	}
	
	public void run() {
		Track track = new Track(factories.size() * 2);
		
		while (!parking.isFull()) {
			for(CarFactory factory: factories) {
				track.receiveFrom(factory);
			}
			
			while (!track.isEmpty()) {
				/*
				 * TODO
				 * Klasa CustomsParking, ktora przy dodawaniu sprawdza czy nie ma
				 * ju¿ samochodu z takim samym VIN
				 */
				parking.add(track.dischargeCar());
			}
		}
	}
}
