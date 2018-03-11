import java.util.Scanner;
class Code_b
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		long test=scanner.nextLong();
		for(int i=0;i<test;i++)
		{
			long choc=scanner.nextLong();
    		long wrap=scanner.nextLong();
    		long days=choc;
    		long temp=(choc+wrap)/7;
    		System.out.println(days+temp);
		}
	}
}