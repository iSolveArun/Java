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
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch: str.toCharArray() )
		{
			if(map.containsKey(ch)) {
				
				int val = map.get(ch);
				map.put(ch, val+1);
			}
			else{
				map.put(ch, 1);
			}
			}
			System.out.println(map);
			}
		}	
	