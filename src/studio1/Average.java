package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner jaunt = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		int n1 = jaunt.nextInt();
		System.out.println("The second of two integers to be averaged?");
		int n2 = jaunt.nextInt();
		System.out.println("The average of " + n1 + " and " + n2 + " is " + (double) (n1+n2)/2);
		// TODO Auto-generated method stub

	}

}
