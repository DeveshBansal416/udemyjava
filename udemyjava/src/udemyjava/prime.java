package udemyjava;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		
//		System.out.println("Hello");
		int count =0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=2;
		if(i==1) {
			System.out.println("neither prime nor non prime");
		}
		while(i<n) {
			if(n%i==0) {
				count ++;
				break;
			}
			
			i++;
		}
		if(count==1) {
			System.out.println("non prime");
		}
		else {
			System.out.println("prime");
		}
	}
}
