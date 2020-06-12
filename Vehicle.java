package vehicle;

public class Vehicle {
	protected String color;
	private int maxSpeed;
	protected int maxSpeed1;
	public Vehicle() {
		System.out.println("Veh");
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int speed) {
		maxSpeed = speed;
	}
	
	
	public void print() {
		System.out.println("Vehicle Color : "+color);
		System.out.println("Vehicle Speed : "+maxSpeed);
	}
}
