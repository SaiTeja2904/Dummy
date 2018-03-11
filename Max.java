import java.util.*;
class Max
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
	 	int[] some=new int[total];
	 	String[] dome=new String[total];
	 	for(int i=0;i<total;i++)
	 	{
	 		some[i]=sc.nextInt();
	 		dome[i]=String.valueOf(some[i]);
	 	}
	 	Arrays.sort(dome);
	 	for(String x:dome)
	 	{
	 		System.out.println(x);
	 	}

	 	String output="";

	 	for(int k=total-1;k>=0;k--)
	 	{
	 		output+=dome[k];
	 	}
	 	//System.out.println(output);
	 	System.out.println(Long.parseLong(output));
	}
}