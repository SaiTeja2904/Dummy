import java.util.Scanner;
class Sainath
{
	public static void main(String[] args) {
		//System.out.println("Enter key string");
		Scanner sc=new Scanner(System.in);
		//String key=sc.next();
		System.out.println("Enter total number of strings");
		int total=sc.nextInt();
		String data[]=new String[total];
		for(int i=0;i<total;i++)
		{
			data[i]=sc.next();
		}
		System.out.println("Enter string");
		
		int abc=sc.nextInt();
		for(int j=0;j<abc;j++){
			String key=sc.next();
		int key_len=key.length();
		int count=0;
		for(int i=0;i<total;i++)
		{
			if(key.contains(data[i]))
			{
				count=count+data[i].length();
			}
		}
		if(count==key_len)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
	}
}