package firstproject;
import java.util.Scanner;
class Person{
	private String name;
	private int age;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		if(age>0) {
			this.age=age;
			
		}else {
			System.out.println("Age must be positive");
		}
		
	}
	
}

public class accessmodifiers {
	public static void main(String[]args) {
		Person person=new Person();
		person.setname("Anbu");
		person.setage(23);
		
		
		
		System.out.println("the neme is"+person.getname());
		System.out.println("the age is"+ person.getage());
	}

}
