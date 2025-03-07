package array;
class Students{
	public String name;
	public int rollno;
	
	Students(String name){
		this.name=name;
	}
	
	@Override
	
	public String toString() {
		return name;
	}
}
   

public class Array2 {
	public static void main(String[]args) {
		Students[] mystudent=new Students[] {
				new Students("anbu"),new Students("dhamu"),new Students("karthi")
				
		};
		
		for(Students m :mystudent) {
			System.out.println(m);
		}
	}

}

