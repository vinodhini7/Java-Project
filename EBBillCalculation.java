package loopingTasks;

import java.util.Scanner;

public class EBBillCalculation {
	public static void main(String[] args) {
		EBBillCalculation eb = new EBBillCalculation();
		eb.calculateBill();
	}

	private void calculateBill() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units consumed");
		int noOfUnitsConsumed=sc.nextInt();
		double amount = 0;
		if(noOfUnitsConsumed<=100) {
			System.out.println("The total charge for the current month is " + amount);
		}
		else if((noOfUnitsConsumed<=200) && (noOfUnitsConsumed>100) ) {
			
			amount = amount+(noOfUnitsConsumed-100)*1.5+20;
			System.out.println("The total charge for the current month is " + amount);
		}
		
		else if((noOfUnitsConsumed<=500) && (noOfUnitsConsumed>200) ) {
			
			amount = amount+(100*2)+(noOfUnitsConsumed-200)*3+30;
			System.out.println("The total charge for the current month is " + amount);
		}
		
		else
		{
			amount = amount+(100*3.5)+(300*4.6)+(noOfUnitsConsumed-500)*6.6+50;
			System.out.println("The total charge for the current month is " + amount);
		}
		
			
	}

}
