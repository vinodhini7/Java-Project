package Firstassignment;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int yr = sc.nextInt();
		if (yr % 4 == 0) {
			System.out.println("Leap year");
		} else
			System.out.println("not leap year");

	}

}
