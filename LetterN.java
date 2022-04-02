package tamilnadu.chennai;

public class LetterN {
	public static void main(String[] args) {
		
		LetterN lN = new LetterN();
		lN.dofunction();

	
	
	}

	public void dofunction() {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			if(i==1)
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
					if(star==1||star==4||star==2)
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
				for(int star=1;star<=4;star++)
				{
					if(star==1||star==3||star==4)
					{
				System.out.print("* ");
				}
					else
						System.out.print("  ");
				}
				System.out.println();
				}
			}
		
	}
}

