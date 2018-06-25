package learning;

import java.util.*;


public class StringReverse {
					
/*			public static void main(String[] args){
				
				String original, reverse="";
				@SuppressWarnings("resource")
					Scanner in = new Scanner(System.in);
					System.out.println("Enter the String");
					original=in.nextLine();
				
				int length=original.length();
				for(int i=length-1;i>=0;i--)
				
		            reverse= reverse+original.charAt(i);			 
					System.out.println("Enter Reverse String is:"+reverse);
						}
	*/






public static void main(String []args){

        String s ; String rev ="";
             Scanner in = new Scanner(System.in);
			System.out.println("Enter the String");
			s=in.nextLine();
			     int len= s.length();
        for(int i=len-1; i>=0 ;i--)
        
        rev= rev+s.charAt(i);

	     System.out.println(rev);
    
}
}