package vehicle;

public class Car extends Vehicle {
	
	boolean isConvertible;
	int numberOfGears;
	
	public Car() {
		System.out.println("Car");
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
	public void printCar() {
		super.print();
		System.out.println("Vehicle number of gears : "+numberOfGears);
		System.out.println("Vehicle is Convertible : "+isConvertible);
		
	}
	
	public void print() {
		super.print();
		System.out.println("Vehicle number of gears : "+numberOfGears);
		System.out.println("Vehicle is Convertible : "+isConvertible);
		
	}
	
}
