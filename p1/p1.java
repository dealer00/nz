package p1;

import p1.abstractions.Car;
import p1.abstractions.CarFactory;
import p1.factories.FordFactory;
import p1.utils.*;

public class p1 {

	public static void main(String[] args) {
		LogInterface logger = new ConsoleLog();
		logger.line("Hello, world!");
	}

}
