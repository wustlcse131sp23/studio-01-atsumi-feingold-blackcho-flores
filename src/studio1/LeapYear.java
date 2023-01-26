package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner jaunt = new Scanner(System.in);
		System.out.println("What year?");
		int y1 = jaunt.nextInt();
		boolean isLeapYear = ((y1%4==0) && (y1%100!=0) || y1%400==0);
		System.out.println(y1 + " is a leap year: " + isLeapYear);
		// TODO Auto-generated method stub

	}

}
