package unaryOperater;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TernaryOperator to = new TernaryOperator();
		to.dofunction();

	}

	private void dofunction() {
		// TODO Auto-generated method stub
		int n = 100>50?100:50;
		System.out.println(n);
		
		boolean value = 100!=50?true:false;
		System.out.println(value);
		
	}

}
