package loopingTasks;

import java.util.Scanner;

public class ConsecutiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsecutiveNumbers cn = new ConsecutiveNumbers();
		cn.dofunction();

	}

	private void dofunction() {
		// TODO Auto-generated method stub
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int number = 0;
		while (range > 0) {
			System.out.println(++number);
			range--;
		}

	}

}
