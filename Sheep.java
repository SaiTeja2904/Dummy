import java.util.Scanner;
class Sheep
{
	static boolean getCount(int[] flag){
		for(int i=0;i<flag.length;i++)
		{
			if(flag[i]==0)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter total number of test cases");
		Scanner scanner=new Scanner(System.in);
		int cas=scanner.nextInt();
		String sol[]=new String[cas];
					int u=0;
		for(int j=0;j<cas;j++)
			{

				int start=scanner.nextInt();
				if(start==0)
					sol[u]="Insomnia";
					//System.out.println("Insomnia");
				else{
					int total=10;
					int flag[]=new int[total];
					
					for(int i=0;i<total;i++)
						flag[i]=0;
						int i=0;
					while(getCount(flag)){
						int number=start*i++;
						while (number > 0) {
                		int abc= number % 10;
                		flag[abc]=1;
                		number = number / 10;
						}
					}
				sol[u]=(--i*start)+"";
				}
				u++;
			}
			for(String out:sol)
				System.out.println(out);
		}
}
