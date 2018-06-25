package learning;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		
	     	int word=1;
	        @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String str=s.nextLine();
	        for(int i=0;i<str.length();i++)
	            {
	                if(str.charAt(i)==' ' && str.charAt(i-1)!=' ')
	                word++;
	            }
	       System.out.println("Total Number of words= "+word);
	    }
	}
