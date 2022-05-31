package loopAssingments;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi=2.31;
	System.out.println("enter the radius");
		int radius=sc.nextInt();
		
		System.out.println("Ther area of the circle is " +2*pi*Math.pow(radius, 2));
	}

}
