package whileLoops;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		PrimeNumber pn = new PrimeNumber();
		pn.checkPrimeNumber();
	}

	private void checkPrimeNumber() {
		// TODO Auto-generated method stub
		int input =13;
		int count=1;
		int flag=0;
		while(count<=input) {
			
			if(input%count==0) {
				flag=flag+1;
			}
			count=count+1;
		}
		if(flag==2)
		{
			System.out.println("Input is prime");
		}
		else
		{
			System.out.println("Input is not prime");
		}
	}

}
