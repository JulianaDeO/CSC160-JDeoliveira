
public class CarDriver {

	public static void main(String[] args) {
		Car myCar = new Car("pink");
		System.out.println("Car color is"+ myCar.getColor());
myCar.selfClean();
Car.WashCar(myCar);
	}

}
