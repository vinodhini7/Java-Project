package whileLoops;

public class printOnetoTen {

	public static void main(String[] args) {
		
		printOnetoTen pt = new printOnetoTen();
		pt.OnetoTen();
	}

	private void OnetoTen() {
		
		int i=0;
		int count =0;
		while(count<=10) {
			System.out.println(i);
			i=i+1;
			count=count+1;
		}
	}

}
