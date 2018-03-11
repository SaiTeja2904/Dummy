import java.util.Scanner;
class Mean
{
	public static void main(String[] args) {
		System.out.println("Enter total number of values");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Float m[]=new Float[n];

		System.out.println("Enter values");
		for(int i=0;i<n;i++)
			m[i]=sc.nextFloat();

		float mean=0,temp_mean=0;

		for(Float i:m){
			temp_mean=temp_mean+i;
		}

		mean=temp_mean/n;
		System.out.println("Mean of given values is "+mean);


		float median_temp,sum=0;
		double median;
		for(int i=0;i<n;i++){
			float z=mean-m[i];
           sum+=z*z;
		}
		median_temp=sum/(n-1);
		median=Math.sqrt((double)median_temp);
		System.out.println("Median of given values is "+median);
	}
}