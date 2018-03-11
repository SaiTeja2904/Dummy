import java.util.Scanner;
class SuperNumber
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String a=scanner.next();
		String b=scanner.next();
		int pos=-999;
		Boolean flag=true;
		for(int i=0;i<b.length();i++)
		{
			char c=b.charAt(i);
			int index=a.indexOf(c);
			if(index>pos)
			{
				pos=index;
			}
			else
			{
				flag=false;
				break;
			}
		}

		if(flag)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
}