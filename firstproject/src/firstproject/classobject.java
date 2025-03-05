package firstproject;

class Car{
	
	String brand;
	int speed;
	
	
	Car(String brand,int speed){
		this.brand=brand;
		this.speed=speed;
	}
	
	void displayCarInfo() {
		System.out.println("Car Brand:"+brand);
		System.out.println("the speed :"+ speed+"m/s");
	}
	
}

public class classobject {

	public static void main(String[] args) {
		Car myCar=new Car("Audi",150);
		
		myCar.displayCarInfo();

	}

}
