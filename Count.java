import java.util.*;
class Count{
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner scanner=new Scanner(System.in);
		String data=scanner.nextLine();
		StringTokenizer st = new StringTokenizer(data," ");  
     	while (st.hasMoreTokens()){  
        	String internal=st.nextToken();  
         	int count=0;
			for(int i=0;i<internal.length();i++)
			{
				if(internal.charAt(i)=='e')
				{
					count++;
				}
			}
			if(count>=2){
				System.out.println(internal);
			}
		}
		
	}
}