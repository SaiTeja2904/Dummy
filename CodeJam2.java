import java.util.*;
import java.io.*;
class CodeJam2
{
	private static final String FILENAME = "f:\\sample.out";
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = null;
		FileWriter fw = null;

		fw = new FileWriter(FILENAME);
		bw = new BufferedWriter(fw);
		Scanner scanner = new Scanner(new BufferedReader(new FileReader("F:\\B-small-practice.in")));
		int inputs=scanner.nextInt();
		for(int k=0;k<inputs;k++)
		{
			int number= scanner.nextInt();
			String data[]=new String[number];
			for(int i=0;i<number;i++)
			{
				data[i]=scanner.next();
				//System.out.println(data[i]);
			}
			int count=0,count1=0;
			Boolean flag=true;
			for(int i=0;i<number && flag ;i++)
			{
				int tempCount=0;
				String temp=data[i];
				for(int j=0;j<number;j++)
				{
					if(temp.charAt(j)=='X'){
						tempCount++;
					}
				}
				//System.out.println(tempCount);
				if(tempCount==1)
				{
					count++;
					System.out.println("found "+ k +" " + i);
				}
				else if(tempCount==2)
				{
					count1++;
					
				}
				else
				{
					flag=false;
					
				}
			}

			String output="x";
			if(flag)
			{
				if(count==1 && count1 == (number-1)){
					//System.out.println("Possible");
					output="POSSIBLE";
				}
			}
			else
				output="IMPOSSIBLE";

			
			System.out.print(output);
			bw.write("Case #" + (k+1) + ": " + output);
			bw.newLine();
			



		}
		bw.close();
		fw.close();
	}
}