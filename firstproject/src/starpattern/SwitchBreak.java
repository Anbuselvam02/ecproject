package starpattern;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("N:");
		
		int N=sc.nextInt();
		
		switch(N) {
		case 10:
			System.out.println("ten");
			
			break;
		case 20:
			System.out.println("twenty");
			break;
			
		case 30:
			System.out.println("thirty");
			break;
			
		default:
			System.out.println("Infinate");
		}
	}

}
