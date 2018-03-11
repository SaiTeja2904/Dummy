import java.util.*;
class Reverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String query=sc.nextLine();
		System.out.println("Given String :"+query);
		StringTokenizer st=new StringTokenizer(query);
		String finalSol="";
		while(st.hasMoreElements()){
			String temp=st.nextElement().toString();
			String reverse = new StringBuffer(temp).reverse().toString();
			finalSol=finalSol+reverse+" ";
		}
		System.out.println("Output String:"+finalSol);
	}
}