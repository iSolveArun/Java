package learning;

import java.util.Arrays;

public class Sortting {
	
	public static void main(String arg[]){
		 int  arr[] ={23,56,89,4,56,35,12};
		 System.out.println(" The sorting before array list:");
		 for (int number: arr)
		 {
			 System.out.println(number);
		 }
		Arrays.sort(arr);
		System.out.println(" The sorting after array list:");
		for ( int number :arr)
		{
			System.out.println(number);
			
		}
		
	}

}
