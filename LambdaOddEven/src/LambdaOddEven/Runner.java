package LambdaOddEven;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the turns :");
		 Scanner s= new Scanner(System.in);
		 int n= s.nextInt();
		System.out.println(n);
		
		
		
		
		
		for(int i=1;i<=n;i++){
			/*System.out.println("please enter the choice to be tested :");
			 Scanner p= new Scanner(System.in);
			 int b= p.nextInt();
			System.out.println(b);*/

			System.out.println("please enter the number to be tested :");
			 Scanner t= new Scanner(System.in);
			 int r= t.nextInt();
			System.out.println(r);
			
				chkIf c = (m) -> {

			if (r % 2 == 0) {
				System.out.println("The number is " + r + " is even");
			} else {
				System.out.println("The number is " + r + " is odd");
			}
			return r;

			

		};
		
		c.checkodd(r);
		
		}
		
	
		

	}
		
}

