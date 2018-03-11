import java.util.Scanner;
class Prob1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int j=1;
		//System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int low=0,up=n-1;
	
         int z=0;
		while(low<=up){
			if(z%2==0){
              System.out.print(a[low++]+" ");
			}
			else
			{
				System.out.print(a[up--]+" ");
			}
			z++;
		}

	}
}