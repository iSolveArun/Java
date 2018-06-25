package learning;

import java.util.*;

public class ArrayListDuplicate {

	public static void main(String[] args) {
	
		List<String > Dub = new ArrayList<String>(); // using String value
		Dub.add("Arun");
		Dub.add("Ram");
		Dub.add("Mani");
		Dub.add("Arun"); // duplicate
		Dub.add("kumar");
		Dub.add("Rajesh");
		System.out.println("list of prime numbers : " + Dub);
//		Collections.reverse(Dub);
		Set<String> ass = new LinkedHashSet<String>(Dub); // using String value
//		Dub.clear();
		Dub.addAll(ass);
		Dub.remove("duplicate");
		System.out.println("list of string without duplicates : " + Dub);
	}

}


				
	
		