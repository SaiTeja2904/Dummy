import java.util.Scanner;
class SafeSquares
{
	public static void main(String...args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);

		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int mon=sc.nextInt();
		int a[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]=0;
			}
		}

		for(int i=0;i<mon;i++)
		{
			int mon_row=sc.nextInt();
			int mon_col=sc.nextInt();
			if(a[mon_row][mon_col]==1)
			{
				System.out.println("\nError");
				break;
			}

			else
				a[mon_row][mon_col]=1;

		}

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("");
		}

int k,cou=0;

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				for(k=1;k<i+1 && k<j+1;k++)
				{

					if(a[k-1][k-1]==0)
					{
						cou++;
					}
				}
				if(cou==k*k)
					count++;
			}


		}
		System.out.println(count);

	}
}