package udemyjava;

public class sizeandrangeofdata {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("int Min: "+Integer.MIN_VALUE);
//		System.out.println("int Max: "+Integer.MAX_VALUE);
//		System.out.println("int Bytes: "+Integer.BYTES);
		
		//removes special charaacters from the string 
//		String str="a!B@C#1#2%3";
//		str=str.replaceAll("[^a-zA-Z0-9]","");
//		System.out.println(str);
//	int i=1;
//	while(i<100) {
//		System.out.println(i);
//		i+=2;
//	}
//	
		//reverse a number by mathmatical approach
		
//		int n=237;
//		int rev=0;
//		int r=0;
//		int pow=1;
//		while(n>0) {
//			r=n%10;
//			rev=(rev*10)+r;
//			
//			n=n/10;
//		}
//		System.out.println(rev);

//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("("+i+","+j+") ");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				
//			}
//		}
		int A[]= {3,9,7,8,12,6,15,4,10};
		int max1=A[0];
		int max2=A[0];
		
		for(int i=0;i<A.length;i++) {
			if(A[i]>max1) {
					max2=max1;
					max1=A[i];
			}
			else if(A[i]>max2) {
				max2=A[i];
			}
		}
		System.out.println(max2);
		
		
	}

}
