package firstproject;

import java.util.Scanner;

public class fibnocci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("n:");
		
		int n=sc.nextInt();
		
		int first=1, second=1;
		
		System.out.print(first +" "+second +" ");
		
		for (int i=3;i<=n;i++) {
			int next=first+second;
			System.out.print(next +" ");
			
			
			second=first;
			second=next;
		}
	}
}
