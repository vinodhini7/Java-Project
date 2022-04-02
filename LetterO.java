package tamilnadu.chennai;

public class LetterO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterO lO = new LetterO();
		lO.dofunction();
		
		
		
	}

	public void dofunction(){
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			if(i==1||i==3)
			{
		for(int star=1;star<=3;star++)
		{
			if(star==2)
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
				for(int star=1;star<=3;star++)
				{
					if(star==1||star==3)
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
