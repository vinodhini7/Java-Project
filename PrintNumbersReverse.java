package whileLoops;

public class PrintNumbersReverse {
	public static void main(String[] args) {
		PrintNumbersReverse pn =new PrintNumbersReverse();
		pn.dofunction();
	}

	private void dofunction() {
		// TODO Auto-generated method stub
		int number=10;
		while(number>=0) {
			System.out.println(number);
			number=number-1;
		}
	}

}
