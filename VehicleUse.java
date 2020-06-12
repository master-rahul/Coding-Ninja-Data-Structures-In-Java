package vehicle;

public class VehicleUse {
	public static class Hello{
		
	}
	public static void main(String args[]) {
		//Vehicle v1 = new Vehicle();
		//v1.print();
		Car c1 = new Car();
		c1.color = "Red";
		c1.numberOfGears = 5;
		c1.setMaxSpeed(100);
		//c1.print();
		//c1.printCar();
		Vehicle v1 = new Car();
		System.out.println(v1);
	//	v1.isConvertible();
	//	v1.printCar();
		//v1.print();
		Hello c2 = new Hello();
		System.out.println(c2);
	}
}
