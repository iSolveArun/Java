package learning;
import java.util.*;  
//import java.util.ArrayList;
//import java.util.Iterator;

 
public class Arraypgm {

	public static void main(String[] args){
////	String [] a1 ={"Arun","mani","Arun","kumar","ram","Praveen","kumar"};
//	Integer[]	num	 ={12,4,78,96,53,21,45,42,4,96};
//	
//
//	
//	for(int i=0;i<num.length-1;i++)
//		{
//		for(int j=i+1;j<num.length;j++)
//			{
//			if((num[i].equals(num[j])) && (i!=j))
//	
//			{
//				System.out.println(num[i]);
//			}
//		}
//	}
//	}
//}

//		String [] a1 ={"Arun","mani","Arun","kumar","ram","Praveen","kumar"};
		Integer[]	num	 ={12,4,78,96,53,21,45,42,4,96};
		
		HashSet<Integer> has = new HashSet<Integer>();
		for(Integer ing:num){
		{
		if(!has.add(ing))
		{
			System.out.println("Duplicate Element is : "+ing);
		
		}
	}	
}
}
}