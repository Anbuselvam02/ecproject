package firstproject;
interface Animal{
	void makeSound();
}
interface pet{
	void play();
}
class dog implements Animal,pet{
	public void makeSound() {
		System.out.println("Dog Barks");
	}
	public void play() {
		System.out.println("Dog loves to play");
	}
}

public class multipleinheritance {
	public static void main(String[]args) {
		dog myDog = new dog();
		myDog.play();
		myDog.makeSound();
	}

}
