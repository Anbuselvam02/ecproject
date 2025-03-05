package firstproject;

class NewCar{
	void start() {
		System.out.println("Car starting");
		
	}
}
class veicle extends NewCar{
	void drive() {
		System.out.println("Car driving");
	}
}
class Electric extends veicle{
	void charge() {
		System.out.println("Car is Charging");
	}
}

public class multilevelInheritance {
	public static void main(String[]args) {
		Electric tesla=new Electric();
		
		tesla.charge();
		tesla.start();
		tesla.drive();
	}

}
