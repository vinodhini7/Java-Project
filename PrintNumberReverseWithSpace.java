package loopingTasks;

import java.util.Scanner;

public class PrintNumberReverseWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumberReverseWithSpace ps = new PrintNumberReverseWithSpace();
		ps.dofunction();

	}

	private void dofunction() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			System.out.print(n%10+" ");
			n=n/10;
			
			
		}
		
	}

}
