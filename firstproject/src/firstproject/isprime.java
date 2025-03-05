package firstproject;
import java.util.Scanner;

public class isprime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("n:");
		
		int n=sc.nextInt();
		
		boolean isPrime= true;
		
		
		if(n<=1) {
			isPrime=false;
			
			
		}else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%2==0) {
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(n +"  is prime");
		}
		else {
			System.out.println(n +"  is not prime");
		}
		
		

	}

}
