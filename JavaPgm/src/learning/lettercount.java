package learning;

import java.util.HashMap;
import java.util.Scanner;

public class lettercount {

	public static void main(String[] args) {
			
		String str;
		String space =" ";
		Scanner ins = new Scanner(System.in);
	    System.out.println("Enter the value");
	    str = ins.nextLine();
		HashMap<Character,Integer> mapp = new HashMap<>();
		
		for(char ch: str.toCharArray() )
		{
			if(mapp.containsKey(ch)) {
				
				int val = mapp.get(ch);
				mapp.put(ch, val+1);
			}
			else{
				mapp.put(ch, 1);
			}
			}
			System.out.println(mapp);
			}
		}	
	