package learning;

import java.util.Scanner;

public class MyFibonacci {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

			int n,a=0,b=0,c=1;
			Scanner in= new Scanner(System.in);
			System.out.println("Enter the no.of values");
			n=in.nextInt();
			System.out.println("Fibonacci Series:");
			for(int i=0;i<n;i++)
			{
				a=b;
				b=c;
				c=a+b;
				System.out.print(c+" ");
			}
	}

}				
				
				
				

			