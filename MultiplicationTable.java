package whileLoops;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		MultiplicationTable mt =new MultiplicationTable();
		mt.performfunction();
	}

	private void performfunction() {
		// TODO Auto-generated method stub
		int input = 3;
		int count=1;
		int result=0;
		while(count<=10) {
			result=input*count;
			count=count+1;
			System.out.println(result);
		}
		
	}

}
