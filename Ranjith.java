import java.util.Scanner;
class Ranjith
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a huge number");
		String val1[]=new String[5];
		
		for (int j=0;j<5;j++ ) {
		val1[j]=scanner.next();	
		}
		
		for (int i=0;i<5;i++ ) {
		StringBuffer sbf = new StringBuffer(val1);
		char[] strArray = val1.toCharArray();
		for (int j=0;j<5;j++ ) {
	    StringBuffer sbf = new StringBuffer(val1);
		char[] strArray = val1.toCharArray();
		        	
			
		}
		
		
		/*for(int i=0;i<strArray.length;i++)
			System.out.print(strArray[i]+" ");*/
		char[] str2Array = val2.toCharArray();
		/*for(int i=0;i<str2Array.length;i++)
			System.out.print(str2Array[i]+" ");
*/
		if(val1.length()>val2.length())
			System.out.println("val1 is greater");
		else if(val1.length()<val2.length())
			System.out.println("val2 is greater");
		else {
		  for(int j=0;j<val1.length();j++)
		  	{
		  		if(strArray[j]>str2Array[j]){
		  			System.out.println("val1 is greater");
		  			break;
		  		}
		  		else if(strArray[j]<str2Array[j]){
		  			System.out.println("val2 is greater");
		  			break;
		  		}

		  	}
		}



	}
}