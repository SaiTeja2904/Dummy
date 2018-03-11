import java.util.Scanner;
class PatternN
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.print('*');
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.print('*');
			for(int j=0;j<size-i-1;j++)
				System.out.print(" ");
			
			
			System.out.print('*');
			
			System.out.print("\n");
		}
	}
}