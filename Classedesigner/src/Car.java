
public class Car {
	private String color;
	private double amountofgas;
	private int mileage;
	
	public Car() {
	color = "grey";
	amountofgas=10.0;
	 mileage=10;

}
	public Car(String requestedColor) {
		color=requestedColor;
	}
	public Car(String requestedColor, double amountofGas) {
		color=requestedColor;
		this.amountofgas= amountofGas;
	}
	public double getAmountofgas() {
		return amountofgas;
	}
	public void setAmountofgas(double amountofgas) {
		this.amountofgas = amountofgas;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Car(String color, double amountofgas, int mileage) {
		super();
		this.color = color;
		this.amountofgas = amountofgas;
		this.mileage = mileage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color.equals("titanium"));
		
	}
	public void selfClean()
	{
		System.out.println("clean car.");
	}
	public static void WashCar(Car myCar) {
		System.out.println("clean .");
		
	}
}