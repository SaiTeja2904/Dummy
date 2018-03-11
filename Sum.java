import java.util.Scanner;
class Sum
{
	public int sum67(int nums[]){
		boolean flag=true;
		int sum=0;
		for(int i:nums){
			if(i==6 && flag){
				flag=false;
			}

			else if(i==7 && !flag){
				flag=true;
			}

			else if(flag)
				sum+=i;
		}

		return sum;
	}

	public static void main(String[] args) {
		Sum s=new Sum();
		System.out.println("Enter number of input values");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int values[]=new int[size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
			values[i]=sc.nextInt();
		System.out.println((char)4);
		System.out.println("Sum is: "+s.sum67(values));
	}
}