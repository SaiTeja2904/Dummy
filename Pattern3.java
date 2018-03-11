import java.util.*;
class Pattern3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String base=sc.next();
		int leng=base.length();
		

		for(int i=0;i<leng;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(base.charAt(j));
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			
		}
	}
}