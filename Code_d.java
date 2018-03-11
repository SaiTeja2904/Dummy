import java.util.*;
class Code_d
{

	static int count=1;
    static String test;
    static Boolean flag=true;
	public static Boolean check(String val)
	{
		if(val.equals("-"))
		{
			return false;
		}
		if(test.equals(val)){
			flag=false;
			return true;
		}
		count++;
		return false;
	}
	public static void last()
	{
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		test=scanner.next();
		
		String arr[][]=new String[101][101];
		for(int i=1;i<=100;i++)
		{
			for(int j=1;j<=100;j++)
			{
				if(i==1 || j==1)
				{
					arr[i][j]=j+"/"+i;
				}
				else if(i%j==0 || j%i==0)
				{
					arr[i][j]="-";
				}
				else
				{
					arr[i][j]=j+"/"+i;
				}
			}
		}

		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}*/


		int c=0;
		int i=1;int j=1;
		//System.out.println(arr[i][j]);c++;
		//System.out.println(arr[i][j]);c++;
		if(check(arr[i][j]))
				{
					last();
				}
		while(flag)
		{
			if(i==1)
			{
				j++;
			}
			while(j!=1)
			{
				
				//System.out.println(arr[i][j] + " ");c++;
				//System.out.println(arr[i][j]);c++;
				if(check(arr[i][j]))
				{
					last();
				}
				i++;
				j--;
			}
			
			//System.out.println(arr[i][j]);c++;
			if(check(arr[i][j]))
				{
					last();
				}

			if(j==1)
			{
				i++;
			}
			while(i!=1)
			{
				
				//System.out.print(arr[i][j] + " ");c++;
				if(check(arr[i][j]))
				{
					last();
				}
				i--;
				j++;
			}
			//System.out.println(arr[i][j]);c++;
			if(check(arr[i][j]))
				{
					last();
				}
		}

	}
}