package firstproject;

class Animal{
	String name="Ainimal";
	void makesound() {
		System.out.println("Animal makes sound");
		
	}
	
}
class Dog extends Animal{
	void display() {
		System.out.println("Name:"+name);
		
		makesound();
		System.out.println("Dog Barks");
	}
	
	
}

public class inheritance {

	public static void main(String[] args) {
		 Dog myDog=new Dog();
		 myDog.display();
		// TODO Auto-generated method stub

	}

}
