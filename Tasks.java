package loopingTasks;

import java.util.Scanner;

public class Tasks {
	
	public static void main(String[]args) {
		Tasks ts = new Tasks();
		//ts.traingoer();
		ts.BusTicket();
		
	}

	private void BusTicket() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you travelling in city bus");
		boolean b =sc.nextBoolean();
		if(b==true) {
			System.out.println("what is the rate of per day for mofussil bus");
			float rateOfMoffussilBus = sc.nextFloat();
			System.out.println("what is the rate of per day for city bus");
			float rateOfCityBus = sc.nextFloat();
			System.out.println("How many days do you travel to office?");
			int noOfDays = sc.nextInt();
			float ratePerMonth =(rateOfMoffussilBus+rateOfCityBus)*noOfDays;
			float ratePerMonthNewScheme=rateOfMoffussilBus*noOfDays;
			float profit=ratePerMonth-ratePerMonthNewScheme;
			float profitpercentage=(profit/ratePerMonth)*100;
			
		}
		
	}

	private void traingoer() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rate of ticket per travel");
		float rate = sc.nextFloat();
		System.out.println("enter the season ticket for 90 days");
		float seasonrate=sc.nextFloat();
		float profit;
		float profitpercentage;
		profit = rate-seasonrate;
		System.out.println(profit);
		profitpercentage=(profit/rate)*100;
		System.out.println(profitpercentage);
		System.out.println(profitpercentage+"%");
	}

}
