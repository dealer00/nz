package p1.abstractions;

public class Car {
	private String model;
	private String vin;
	private String brand;
	
	public Car(String brand)
	{
		setBrand(brand);
	}
	
	private void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public void setVin(String vin)
	{
		this.vin = vin;
	}
	
	public String getVin()
	{
		return this.vin;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getModel()
	{
		return this.model;
	}
}
