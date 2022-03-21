package loopingTasks;

import java.util.Scanner;

public class MilkAmount {
	
	public static void main(String[] args) {
		MilkAmount ma = new MilkAmount();
		ma.calculateBill();
	}

	private void calculateBill() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float avimilkamount;
		float privatMilk;
	
		
			System.out.println("Enter the amount for avin milk for 1 day");
			avimilkamount=sc.nextInt()*30+50;
	
			System.out.println("Enter the amount for private milk for 1 day");
			privatMilk=sc.nextInt()*30;
			
			
		
		float profit=privatMilk-avimilkamount;
		System.out.println(profit);
		float profitpercentage=(profit/privatMilk)*100;
		System.out.println("the profit percentage "+  profitpercentage );
		
	}

}
