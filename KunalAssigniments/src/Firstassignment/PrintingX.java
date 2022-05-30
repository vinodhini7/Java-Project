package Firstassignment;

import java.util.Scanner;

public class PrintingX {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		System.out.println("Enter the  number:");
		
		do {
			
			 a= a+b;
			 b=sc.nextInt();
		}
		while(a !='x') ;
			
		System.out.println(a);	
		

}

}
