package whileLoops;

public class PowerValue {
	
	public static void main(String[] args) {
		
		PowerValue pv =new PowerValue();
		pv.dofunction();
	}

	private void dofunction() {
		// TODO Auto-generated method stub
		
		int number = 8;
		int power= 3;
		int count=0;
		int result=1;
		while(count<power)
		{
			
			result=result*number;
			count=count+1;
		}
		System.out.println(result);
	}
    
}
