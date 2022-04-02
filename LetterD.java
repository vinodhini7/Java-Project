package tamilnadu.chennai;

public class LetterD {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterD lD = new LetterD();
		lD.dofunction();
		
		

	}

	public void dofunction() {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			if(i==1||i==3)
			{
		for(int star=1;star<=2;star++)
		{
			if(star==1)
			{
		System.out.print("* ");
		}
			else
				System.out.print("  ");
		}
		System.out.println();
		}
			else
			{
				for(int star=1;star<=2;star++)
				{
					
					{
				System.out.print("* ");
				}
					
				}
				System.out.println();
				}
		
			}
		
	}

}
