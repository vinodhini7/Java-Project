package loopingTasks;

import java.util.Scanner;

public class PrintThreeNumberReverseWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThreeNumberReverseWithSpace ps = new PrintThreeNumberReverseWithSpace();
		ps.dofunction();
	}

	private void dofunction() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0) {
			System.out.print(n % 1000 + " ");
			n = n / 1000;

		}
	}

}
