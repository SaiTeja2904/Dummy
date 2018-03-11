import java.util.*;
class CodeJam1
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String input= scanner.next();
		input=input.toUpperCase();
		//System.out.println(input);
		String output="";
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			int x;
			if(i==0)
			{
				//First Letter
				c=input.charAt(i+1);
				//System.out.println(c);
				x=(int)c - 65;
				int y=x%26;
				output=output+((char)(y+65));
				//System.out.println(output);

				//System.out.println(x);

			}
			else if(i==input.length()-1)
			{
				//End Letter
				char b=input.charAt(i-1);
				int j=(int)b - 65;
				int y=(j)%26;
				//System.out.println("y="+(y+65));
				output=output+((char)(y+65));
				//System.out.println(output);
			}
			else
			{
				c=input.charAt(i+1);
				char b=input.charAt(i-1);
				//System.out.println(c);
				x=(int)c - 65;
				int j=(int)b - 65;
				int y=(x+j)%26;
				//System.out.println("y="+(y+65));
				output=output+((char)(y+65));
				//System.out.println(output);
			}
		}
		System.out.println(output);
	}
}