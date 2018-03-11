import java.util.Scanner;
class HelpLostRobot
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int i;
		String sol[]=new String[test];
		for(int j=0;j<test;j++){
			String ans;
			Integer x[]=new Integer[2];
			Integer y[]=new Integer[2];
			for(i=0;i<2;i++){
				x[i]=sc.nextInt();
			}
			for(i=0;i<2;i++){
				y[i]=sc.nextInt();
			}

			int flag=0;
			

			if(x[0]<y[0] && x[1]==y[1]){
               ans="right";
			}
			
			else if(x[0]>y[0] && x[1]==y[1]){
               ans="left";
			}

			else if(x[0]==y[0] && x[1]>y[1]){
               ans="down";
			}
			else if(x[0]==y[0] && x[1]<y[1]){
               ans="up";
			}
			else
			ans="sad";	
			sol[j]=ans;
		}
		
		for(String data:sol){
			System.out.println(data);
		}
	}
}