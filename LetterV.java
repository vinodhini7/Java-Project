package tamilnadu.chennai;

public class LetterV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterV lV = new LetterV();
		lV.dofunction();
		
		}

	public void dofunction() {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			if(i==1)
			{
		for(int star=1;star<=5;star++)
		{
			if(star==1||star==5)
			{
		System.out.print("* ");
		}
			else
				System.out.print(" ");
		}
		System.out.println();
		}
			else if(i==2)
			{
				for(int star=1;star<=5;star++)
				{
					if(star==2||star==4)
					{
				System.out.print("* ");
				}
					else
						System.out.print(" ");
				}
				System.out.println();
				}
			else
			{
				for(int star=1;star<=5;star++)
				{
					if(star==3)
					{
				System.out.print("* ");
				}
					else
						System.out.print(" ");
				}
				System.out.println();
				}
			}
		
	}
}


