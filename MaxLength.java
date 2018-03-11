class MaxLength
{
	public static void main(String[] args) {
		String string1="abcsbacd";
		String str1_strings[]=new String[100];
		String sub="";

		int length = string1.length();   
 
      	//System.out.println("Substrings of \""+string1+"\" are :-");
 		int k=0;
      	for(int c = 0 ; c < length ; c++ )
      	{
         	for(int i = 1 ; i <= length - c ; i++ )
         	{
            	sub = string1.substring(c, c+i);
            	//System.out.println(sub);
            	str1_strings[k++]=sub;
         	}
      	}

      	int max=-1;
      	String answer="";
      	String subString="aasbacasd";
      	for(int i=0;i<k-1;i++)
      	{
      		if(subString.indexOf(str1_strings[i])!= -1)
      		{
      			//System.out.println("Found");
      			if(str1_strings[i].length()>max){
      				max=str1_strings[i].length();
      				answer=str1_strings[i];
      			}
      		}
      		//else
      			//System.out.println("Not Found");
      	}

      	System.out.println("Max length substring is "+answer);

	}
}