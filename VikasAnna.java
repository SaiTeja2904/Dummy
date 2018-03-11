import java.util.Scanner;
class VikasAnna
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 3 integers");
		long a=scanner.nextLong();
		long b=scanner.nextLong();
		long c=scanner.nextLong();

		System.out.println("Enter 3 double values");
		int i=1;
		double[] d=new double[3];
		while(i<=3)
		{
			System.out.println("Enter "+i+" double value");
			double temp=scanner.nextDouble();
			if(temp<=10.00 && temp>=0.00)
			{
				d[i-1]=temp;
				i++;
			}
			else
			{
				System.out.println("It is not in the range of 0,10...Please enter again...!");
			}
		}

		System.out.println("Sum of three integers is:"+(a+b+c));
		System.out.println("First integer divided by second integer:"+((double)a)/b);	
		System.out.println("First integer evenly divided by second integer:"+(a/b)+" \n     &Remainder is "+(a%b));
		double soln=((double)c)-d[2];
		System.out.println("Third int (minus) Third double:"+soln);

	}
}