package learning;

import java.util.*;

public class ArrayListreplace {

	public static void main(String[] args) {
		List<String> ele = new ArrayList<String>();
		ele.add("Arun");
		ele.add("Magesh");
		ele.add("Chennai");
		System.out.println("Arraylist before replace:" + ele);
		ele.set(2,"kumar");
		ele.set(0,"MAni");
		System.out.println("Arraylist After replace:" + ele);

	}

}



