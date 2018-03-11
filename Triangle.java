import java.util.Scanner;
public class Triangle
{
	public static void main(String[] args) {
		System.out.println("Enter number of lines:");
		Scanner sc=new Scanner(System.in);
		int lines=sc.nextInt();
		int i,j,k;
		for(i=1;i<=lines;i++)
		{
			for(j=(lines-i)*2;j>=0;j--){
				System.out.print(" ");
			}

			for(k=i;k>0;k--)
			{
				System.out.print(k+" ");
			}

			for(k=2;k<=i;k++){
				System.out.print(k+" ");
			}
            System.out.println("");
		}
	}
}