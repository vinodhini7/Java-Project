public Class Library{

package tamilnadu.chennai;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library pd = new Library();
		pd.learn_if();
		pd.learn_if1();
		pd.learn_if2();
		pd.looping();
		pd.temple();
		pd.goldraja();
		

	}
	

	private void goldraja() {
		// TODO Auto-generated method stub
		int gold=1;
		int day=1;
		int total=0;
		while(day<8) {
			System.out.println(gold);
			gold=gold*2;
			day=day+1;
			total=gold+total;
			System.out.println(total);
			
		}
	}


	private void temple() {
		// TODO Auto-generated method stub
		int flowers=1024;
		int temple=0;
		while(flowers>0) {
			temple=temple+1;
			flowers=flowers/2;
		}
		System.out.println(temple);
		
	}


	private void looping() {
		// TODO Auto-generated method stub
		int purse=0;
		int day =1;
		while(day<=50) {
			purse = purse+day;
			day = day+1;
		}
		System.out.println(purse);
	}


	private void learn_if2() {
		// TODO Auto-generated method stub
		int amt1 =101;
		int petrol =120;
		if(amt1>100) {
			if(petrol==104) {
				System.out.println("fill petrol");
			}
			else
			{
				System.out.println("fill half litre");
			}
			
		}
	}

	private void learn_if1() {
		// TODO Auto-generated method stub
		boolean school =true;
		boolean raining = true;
		 if(school==true && raining == true) {
			 System.out.println("take umberella");
		 }
		 else
		 {
			 System.out.println("take rest");
		 }
		
		
	}

	public void learn_if() {
		// TODO Auto-generated method stub
		
	}

}
 }
