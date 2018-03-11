import java.util.*;
class Robots
{
public static void main(String args[])
{
int i,n,m,j,p,c=0,z=0;
int a[]=new int[100];
int b[]=new int[100];
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
m=sc.nextInt();
for(i=0;i<n;i++)
a[i]=sc.nextInt();
c=1;
for(i=0;i<m;i++)
b[i]=sc.nextInt();
for(i=0;i<n;i++)
{z=0;
for(j=0;j<m;j++)
{
b[j]=(b[j]+1)%n;
if(a[b[j]]==1&&z==0)
{
c++;
z=1;
}
}
}
c=c-1;
System.out.println(c);
}
}