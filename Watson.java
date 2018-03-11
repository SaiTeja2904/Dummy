import java.util.*;
class Demo
{
public static void main(String args[])
{
int z,min=999,i,j,d,r,sum=0,p=0,n,k,num,l;
int a[]=new int[100];
int b[]=new int[100];

Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int fin[]=new int[num];
for(z=0;z<num;z++)
{
d=sc.nextInt();
min=999;
p=0;
for(i=1;i<1000;i++)
{
n=i;
sum=0;
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
if(sum==d)
{
a[p]=i;
p++;
}
}
for(i=0;i<p;i++)
b[i]=a[i]+1;
for(i=0;i<p;i++)
{
n=b[i];
sum=0;
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
if(sum<min)
min=sum;
}
fin[z]=min;
}
for(int gum:fin)
System.out.println(gum);
}
}