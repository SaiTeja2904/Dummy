import java.util.Scanner;
class Merge
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String a=scanner.next();
		String b=scanner.next();
		String answer="";
		for(int i=0;i<a.length();i++)
		{
			answer=answer+a.charAt(i)+b.charAt(i);
		}
		System.out.println(answer);
	}
}