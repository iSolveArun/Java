package learning;

public class Arraydemo {

	public static void main(String arg[]) {

		int i = 100;
		//
		for (i = 1; i <= 100; i++)
		// System.out.println("The value are :"+i);
		{

			if (i % 2 == 0) {
				System.out.println(i + " ");
			} else if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
