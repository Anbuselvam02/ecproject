package firstproject;
class pubby{
	void makesound() {
		System.out.println("Dog make some noise");
	}
}
class change extends Dog{
	@Override
	void makesound() {
		System.out.println("Dog Barks");
	}
}

public class methodoverriding {
	public static void main(String[]args) {
		change mydog = new change();
		mydog.makesound();
	}

}
