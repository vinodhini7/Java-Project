package whileLoops;

public class Factorial {
	
	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.dofunction();
	}

	private void dofunction() {
		// TODO Auto-generated method stub
		int number=6;
		int result=number;
		while(number>1) {
			int value=number-1;
			
			result=result*value;
			number=number-1;
			
		}
		System.out.println(result);
	}

}
