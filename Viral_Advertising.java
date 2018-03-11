import java.util.Scanner;
class Viral_Advertising
{
	public static void main(String[] args) {
		int m=5,x,y=0;
		Scanner sc=new Scanner(System.in);
		int days=sc.nextInt();
		for(int i=0;i<days;i++)
		{
			x=(m/2)*3;
			y=y+(m/2);
			m=x;	
		}
		System.out.println(y);
	}
}