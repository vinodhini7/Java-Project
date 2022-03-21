package loopingTasks;

import java.util.Scanner;

public class PrintOddPlaceNumberReverseWithSpace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintOddPlaceNumberReverseWithSpace ps = new PrintOddPlaceNumberReverseWithSpace();
		ps.dofunction();
	}

	private void dofunction() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0) {
			int a;
			a=n%100;
			System.out.print(a/10 + " ");
			n = n / 100;

		}
	}

}
