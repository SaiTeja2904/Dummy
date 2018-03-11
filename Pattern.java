import java.util.Scanner;
class Pattern
{
	public static void main(String[] args) {

		System.out.println("Enter size");
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.seperator"));

		int n=sc.nextInt();
		int i,j;
		String st=sc.next();
		System.out.println(st);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.println(" ");
		}
	}
}
/*
Output:
1 2 3
2 4 6
3 6 9 for n=3;
*/