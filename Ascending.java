import java.util.Scanner;
class Ascending
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int mainArray[]=new int[size];
		int ascendingArray[][]=new int[10][10];
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++){
			mainArray[i]=sc.nextInt();
		}
		int row=0,column=0;
		
		int[] sumArray=new int[10];
		int temp=999;	
		for(int i=0;i<size;i++){
			if(mainArray[i]<temp){
				
				row++;
				column=0;
			}
			
			ascendingArray[row][column++]=mainArray[i];
			temp=mainArray[i];
			
		}
		for(int i=0;i<10;i++)
		{
			sumArray[i]=0;
			for(int j=0;j<10;j++)
			{
				if(ascendingArray[i][1]==0)
				{
					ascendingArray[i][0]=0;
				}
				else if(ascendingArray[i][j]!=0){
					
					sumArray[i]+=ascendingArray[i][j];
				}
				
			}
			
		}

		
		
			
				int max=-1,temp1=0;
			for(int i=0;i<sumArray.length;i++){
					if(sumArray[i]>max){
						max=sumArray[i];
						temp1=i;
					}
			}
			
			System.out.print("Sequence:");
			for(int i=0;i<10;i++){
				if(ascendingArray[temp1][i]!=0)
					System.out.print(ascendingArray[temp1][i]+" ");

			}
			System.out.print("\nSum:"+max);

	}

}