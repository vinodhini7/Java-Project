package Firstassignment;

import java.util.Scanner;

public class Leetcode {
	
	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		int result;
		System.out.println("Enter the target element: ");
		int target=sc.nextInt();
		for(int j=0;j<a.length;j++) {
			
		
		for(int i=0;i<a.length-1;i++) {
			if(i!=j) {
			result=a[j]+a[i];
			if(result==target) {
				System.out.println("the indexes are "+ j +" "+(i));
			}
		}
	}
		}
	}
}
