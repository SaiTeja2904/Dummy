import java.util.Scanner;
class Alice
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter total number of bars");
		int number=scanner.nextInt();
		int[] choclates=new int[number];
		//System.out.println("Enter number of bars");
		for(int l=0;l<number;l++)
		{
			choclates[l]=scanner.nextInt();
		}

		int x=0,y=0,i=0,j=number-1;

		int[] flag=new int[number];
		for(int k=0;k<number;k++){
			flag[k]=0;
		}

		int[] firstAccess=new int[number];
		for(int k=0;k<number;k++){
			firstAccess[k]=0;
		}
		int temp=0;
		while((x+y)<number){

			if(flag[i]==0 && choclates[i]>0 && firstAccess[i]!=2)
			{
				System.out.println("***"+i);
				choclates[i]--;
				firstAccess[i]=1;
			}
			if(choclates[i]==0 && flag[i]==0){
				flag[i]=1;
				x++;
				if(flag[i+1]==0){
					i++;
					firstAccess[i]=1;
				}
				System.out.println("x,i updated");
			}
			if(flag[j]==0 && choclates[j]>0 && firstAccess[j]!=1)
			{
				System.out.println("%%%"+j);
				choclates[j]--;
				firstAccess[j]=2;
			}
			if(choclates[j]==0 && flag[j]==0){
				flag[j]=1;
				if(flag[j-1]==0){
					j--;
					firstAccess[j]=2;
				}
				y++;
				System.out.println("y,j updated");
			}
			if(i==j && (x+y)!=number)
			{
				if(firstAccess[i]==1)
					x++;
				else if(firstAccess[i]==2)
					y++;
				break;
			}
		
		
		}
		System.out.println(y+" "+x);
	}
}