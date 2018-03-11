import java.util.*;
class RandomNumbers
{
	public static void main(String[] args) {
		 int p,t,n,i;
		 int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		n=sc.nextInt();
		int MAX_VAL = n;
	     int MIN_VAL = 1;
		Random rand = new Random(); 
         for(p=0;p<=n+1;p++)
        a[p]=0;
       a[0]=1;t=1;
       if(n!=0)
       {
        while(t<=n)
        {
            i=MIN_VAL + rand.nextInt(MAX_VAL - MIN_VAL + 1);
            if(a[i]==0)
            {
                a[i]=1;t++;
                System.out.println(i);
             }
        }

     }
	}
}