package loopingTasks;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumbers en = new EvenNumbers();
		en.dofunction();
	}

	private void dofunction() {
		// TODO Auto-generated method stub
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int number = 1;
		while (range > 0) {
			if (number % 2 == 0) {
				System.out.println(number);
				range--;
			}
			number++;

		}

	}
}
