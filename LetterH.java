package tamilnadu.chennai;

public class LetterH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterH lH = new LetterH();
		lH.dofunction();
		

}

	public void dofunction() {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			if(i==1||i==3)
			{
		for(int star=1;star<=4;star++)
		{
			if(star==1||star==4)
			{
		System.out.print("* ");
		}
			else
				System.out.print("  ");
		}
		System.out.println();
		}
			else if(i==2)
			{
				for(int star=1;star<=4;star++)
				{
					
				System.out.print("* ");
				}
				System.out.println();	
				}
				
				
			

	}
		
	}
}
