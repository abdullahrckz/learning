package learning;

import java.util.Scanner;

public class pyramid {
	
	public void star()
	{
		Scanner h =new Scanner(System.in);
		System.out.println("Enter your no");
		int a=h.nextInt();
		int b=a-1;
		System.out.println("");
		if(a>0)
		{
			for(int i=1;i<=a;i++)
			{
				for(int c=1;c<=b;c++)
				{
					System.out.print(" ");
				}			
					for(int j=1;j<=i;j++)
						{
							System.out.print("*");
							System.out.print(" ");
			
						}
					System.out.println("");					
					b--;				
			}
		}
		else
		{
			System.out.println("please enter vali no");
		}
		
	}
	
	public void check()
	{
		int c=1;
		for (int i=0;i<10;i++)
		{
			System.out.println("abdullah"+c+"hi");
			c++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pyramid s= new pyramid();
		
		//s.star();
		s.check();

	}

}
