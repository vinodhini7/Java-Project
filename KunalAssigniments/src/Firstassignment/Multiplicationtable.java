package Firstassignment;

import java.util.Scanner;

public class Multiplicationtable {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number:");
		int a = sc.nextInt();
		System.out.println("Below is the table for the number "+a);
		int count=1;
		while(count !=11) {
			System.out.println(a+ " * "+count+" = " +(a*count));
			count++;
		}

}
}
