package learning;

import java.util.*;

public class AscendingOrder {

	public static void main(String args[]) {

		int n, temp;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of element array");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the all element");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)

			{
				if (a[i] > a[j]) {
					temp = a[i];

					a[i] = a[j];

					a[j] = temp;

				}
			}

		}

		System.out.println("Accessding Order:");
		for (int i1 = 0; i1 < n - 1; i1++) {
			System.out.println(a[i1] + " ");
		}
		System.out.println(a[n - 1]);
	}
}
