package unaryOperater;

public class Modulus {
	
	public static void main(String[] args) {
		Modulus md = new Modulus();
		md.dofunction();
	}

	private void dofunction() {
		// TODO Auto-generated method stub
		int i=5;
		int n=i++%5;
		//My according to my understanding my answer is 0
		System.out.println(n);
		System.out.println(i);
		//i=6
		
	}

}
