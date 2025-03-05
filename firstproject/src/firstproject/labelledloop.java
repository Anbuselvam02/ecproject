package firstproject;
import java.util.*;

public class labelledloop {
	public static void main(String[]args) {
		for(int i=0;i>=10;i++) {
			if(i==4) {
				continue;
			}
			for(int j=0;j>=10;j++) {
				if(i==5&&j==5) {
					break;
				}
				System.out.println(i+" "+j);
			}
			
		}
		
	}

}
