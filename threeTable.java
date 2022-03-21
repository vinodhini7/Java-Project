package loopingTasks;

import java.util.Scanner;

public class threeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threeTable th = new threeTable();
		th.dofunction();
	}

	private void dofunction() {
		// TODO Auto-generated method stub
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int number = 1;
		while (range > 0) {
			if (number % 3 == 0) {
				System.out.println(number);
				range--;
			}
			number++;

		}

	}

}
